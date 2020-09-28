package com.cfang.ioc.tImport;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author cfang 2020/9/21 14:58
 * @description
 */
@Configuration
@Import(value = {Person.class, Car.class, DogImportSelector.class, CatBeanDefiniitionRegister.class})
public class MainConfig {

}
