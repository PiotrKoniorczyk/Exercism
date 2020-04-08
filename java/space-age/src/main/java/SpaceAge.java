
class SpaceAge {

    private double age;

    SpaceAge(double seconds) {
        seconds *= 100;
        this.age = Math.round((seconds/31556926));
        age /= 100;

    }
    double getSeconds() {
        return age;
    }

    double onEarth() {
        return age;
    }

    double onMercury() {
        return age/0.2408467;
    }

    double onVenus() {
        return age/0.61519726;
    }

    double onMars() {
        return age/1.8808158;    }

    double onJupiter() {
        return age/11.862615;    }

    double onSaturn() {
        return age/29.447498;    }

    double onUranus() {
        return age/84.016846;    }

    double onNeptune() {
        return age/164.79132;    }

}
