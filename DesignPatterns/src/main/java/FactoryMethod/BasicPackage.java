package FactoryMethod;

public class BasicPackage extends Package {
    @Override
    protected void createPackage() {
        decorations.add(new BridalDeco());
    }
}
