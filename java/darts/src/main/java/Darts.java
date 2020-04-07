class Darts {

    double x;
    double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;}

    int score() {
        int score = 0;
        double point = Math.sqrt((x*x)+(y*y));
        if (point <=1)
            score += 10;
        else if (point <=5 && point > 1)
            score += 5;
        else if (point <=10 && point > 5)
            score += 1;

        return score;
    }
}
