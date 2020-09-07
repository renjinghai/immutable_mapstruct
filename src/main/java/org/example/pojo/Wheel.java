package org.example.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Wheel {

    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public Wheel() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wheel other = (Wheel) obj;
        return Objects.equal(this.size, other.size);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.size);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("size", size)
                .toString();

    }
}
