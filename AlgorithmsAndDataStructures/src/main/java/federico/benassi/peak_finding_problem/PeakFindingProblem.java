package federico.benassi.peak_finding_problem;

import com.google.common.base.Stopwatch;

public class PeakFindingProblem<V extends Comparable<V>> {

    private V[] data;

    PeakFindingProblem(V[] data) {
        this.data = data;
    }

    // First Version of the algorithm, Worst case O(n)
    public V findAPeak1Version() {
        if (data.length == 0) return null;

        if (data.length == 1) return data[0];

        for (int i = 0; i < data.length; i++) {
            if (i == 0 && data.length > 1 && data[i].compareTo(data[i + 1]) >= 0) {
                return data[i];
            }

            if (i == data.length - 1 && data.length > 1 && data[i].compareTo(data[i - 1]) >= 0) {
                return data[data.length - 1];
            }

            if (data[i].compareTo(data[i + 1]) >= 0 && data[i].compareTo(data[i - 1]) >= 0) {
                return data[i];
            }
        }

        return null;
    }

    // Recursive Divide and Conquer, T(n) = O(log base 2 of(n))
    public V findAPeak2Version() {
        if (data.length == 0) return null;
        if (data.length == 1) return data[0];
        return recursiveHelperFunction(data.length / 2);
    }

    private V recursiveHelperFunction(int i) {
        if (i == 0) {
            if (data[i].compareTo(data[i + 1]) >= 0) {
                return data[i];
            } else {
                return null;
            }
        }

        if (i == data.length - 1) {
            if (data[i].compareTo(data[i - 1]) >= 0) {
                return data[i];
            } else {
                return null;
            }
        }

        if (data[i].compareTo(data[i - 1]) < 0) {
            return recursiveHelperFunction(i / 2);
        } else if (data[i].compareTo(data[i + 1]) < 0) {
            return recursiveHelperFunction(i + (data.length - i) / 2);
        } else {
            return data[i];
        }
    }

    public V findAPeak3Version() {
        if (data.length == 0) return null;
        if (data.length == 1) return data[0];
        int i = data.length / 2;

        while (i != 0 && i != data.length - 1) {
            if (data[i].compareTo(data[i - 1]) < 0) {
                i = i / 2;
            } else if (data[i].compareTo(data[i + 1]) < 0) {
                i = i + (data.length - i) / 2;
            } else {
                return data[i];
            }
        }

        if (i == 0 && data[i].compareTo(data[i + 1]) >= 0) {
            return data[i];

        }

        if (i == data.length - 1 && data[i].compareTo(data[i - 1]) >= 0) {
            return data[i];
        }
        return null;
    }


    public void printPerformances() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        findAPeak1Version();
        System.out.println(stopwatch.elapsed());
        stopwatch.stop();
        stopwatch.reset();
        stopwatch.start();
        findAPeak2Version();
        System.out.println(stopwatch.elapsed());
        stopwatch.stop();
        stopwatch.reset();
        stopwatch.start();
        findAPeak3Version();
        System.out.println(stopwatch.elapsed());
        stopwatch.stop();
        stopwatch.reset();
    }
}
