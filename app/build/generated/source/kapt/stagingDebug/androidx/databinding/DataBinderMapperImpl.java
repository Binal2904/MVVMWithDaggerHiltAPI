package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.demo.advanced.daggerhilt.DataBinderMapperImpl());
  }
}
