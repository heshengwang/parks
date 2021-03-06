package com.hbyd.parks.ws.officesys;

import com.hbyd.parks.common.base.BaseWS;
import com.hbyd.parks.common.base.RecoverableWS;
import com.hbyd.parks.common.model.PageBeanEasyUI;
import com.hbyd.parks.common.model.ProductTestQuery;
import com.hbyd.parks.dto.officesys.ProductTestDTO;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Created by Zhao_d on 2016/12/28.
 */
@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
@XmlSeeAlso(ProductTestDTO.class)
public interface ProductTestWS extends BaseWS<ProductTestDTO>,RecoverableWS{

    public PageBeanEasyUI getPageBeanByQueryBean(ProductTestQuery query);

    public String getNewNumber(ProductTestQuery query);
}
