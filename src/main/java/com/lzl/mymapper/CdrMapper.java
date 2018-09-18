package com.lzl.mymapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository("cdrMapper")
public interface CdrMapper extends Mapper<CdrDO> {

}
