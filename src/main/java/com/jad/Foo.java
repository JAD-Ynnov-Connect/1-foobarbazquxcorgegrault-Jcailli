package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private final List<Baz> bazs = new ArrayList<>();
    private Qux qux;
    private Corge corge;
    private final List<Grault> graults = new ArrayList<>();

    public Foo(final Bar bar) {
    }

    public Bar getBar() {
        return this.bar;
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public void addBaz(final Baz baz) {
        this.bazs.add(baz);
    }

    public List<Grault> getGraults() {
        return this.graults;
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(final Corge firstCorge) {
        this.corge = firstCorge;
    }
}
