package cresla.entities.modules;

import cresla.interfaces.Module;

public abstract class BaseModule implements Module {

    private int id;

    protected BaseModule(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }


    @Override
    public String toString() {
        //{moduleType} Module – {moduleId}

        StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("%s Module - ").append(this.getId());
        return sb.toString();
    }
}
