package org.glsid.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Ver")
public class Versement extends Operation {

}
