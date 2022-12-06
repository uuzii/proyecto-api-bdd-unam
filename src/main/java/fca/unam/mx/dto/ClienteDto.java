package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClienteDto {
    private Long id;
    private String name;
    private String lastFatherName;
    private String lastMotherName;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getLastFatherName() {
        return lastFatherName;
    }

    public void setLastFatherName(String lastFatherName) {
        this.lastFatherName = lastFatherName;
    }

    @ColumnName("apellido_materno")
    public String getLastMotherName() {
        return lastMotherName;
    }

    public void setLastMotherName(String lastMotherName) {
        this.lastMotherName = lastMotherName;
    }

    @ColumnName("rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
