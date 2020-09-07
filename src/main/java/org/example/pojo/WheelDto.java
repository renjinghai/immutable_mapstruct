package org.example.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class WheelDto {

    private int size;

    public WheelDto(int size) {
        this.size = size;
    }

    public WheelDto() {
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
        final WheelDto other = (WheelDto) obj;
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
