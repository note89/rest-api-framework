package com.seregamorph.restapi.base;

import com.seregamorph.restapi.test.base.BaseResourceTest;

public class WrapperResourceTest extends BaseResourceTest {

    public WrapperResourceTest() {
        super(WrapperResource.class);
    }

    @Override
    public void validateToString() throws Exception {
        expectedException.expect(StackOverflowError.class);

        super.validateToString();
    }

    @Override
    public void validateEqualsAndHashCodeSameRandomInstance() {
        expectedException.expect(StackOverflowError.class);

        super.validateEqualsAndHashCodeSameRandomInstance();
    }

    @Override
    public void validateNotEqualsAndHashCodeDifferentRandomInstances() {
        expectedException.expect(StackOverflowError.class);

        super.validateNotEqualsAndHashCodeDifferentRandomInstances();
    }
}
