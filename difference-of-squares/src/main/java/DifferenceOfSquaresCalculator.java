class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int output = 0;
        for(int i =1;i<=input;i++){
            output += i;
        }
        return (int)Math.pow(output,2);
    }

    int computeSumOfSquaresTo(int input) {
        int output = 0;
        for(int i =1;i<=input;i++){
            output += (int)Math.pow(i,2);
        }
        return output;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

}
