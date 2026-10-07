package com.entreprise.rh;

public interface Augmentable {

    double TAUX_MAX = 0.20;

    public void augmenter(double taux) throws MantantInvalideException;

    default void augmenterStandard() {
        augmenter(0.05);
    }

}
