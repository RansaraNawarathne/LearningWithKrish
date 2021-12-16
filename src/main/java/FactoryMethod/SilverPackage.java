package FactoryMethod;

public class SilverPackage extends Package{
    @Override
    protected void createPackage() {
        decorations.add(new BridesMaidDeco());
        decorations.add(new BridalDeco());
    }
}
