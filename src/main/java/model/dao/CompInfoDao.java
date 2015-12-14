package model.dao;

import model.CompInfo;

import java.util.Collection;
import java.util.List;

public interface CompInfoDao {

    void add(CompInfo compInfo);

    void update(CompInfo compInfo);

    void delete(CompInfo compInfo);

    Collection<CompInfo> getCompInfo(String search);

    public List findByCompInfo(String nameComp, String adrBS, String carrier, String insurer);

}
