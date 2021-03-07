package pl.dorotamiler.kidstherapy.controller.dao;

import java.util.List;

public interface GenericDao<T, PK extends Seriazable> {

    PK create(T newInstance);

    T read(PK id);

    void update(T transientObject);

    void delete(T parsientObcject);

    List<T> getAll();

}