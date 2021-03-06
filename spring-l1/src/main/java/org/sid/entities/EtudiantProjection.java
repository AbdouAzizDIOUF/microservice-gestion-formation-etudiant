package org.sid.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = {Etudiant.class})
public interface EtudiantProjection {
    public String getPrenom();
}
