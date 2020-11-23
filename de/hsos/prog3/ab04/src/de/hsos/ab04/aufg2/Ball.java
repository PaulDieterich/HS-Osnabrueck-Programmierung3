package de.hsos.ab04.aufg2;

public class Ball {

    Rechteck form;
    int bewegungInXProFrame = 4;
    int bewegungInYProFrame = 1;

    Ball(Rechteck m_form, int m_bewegungInXProFrame, int m_bewegungInYProFrame){
        form = m_form;
        bewegungInXProFrame = m_bewegungInXProFrame;
        bewegungInYProFrame = m_bewegungInYProFrame;
    }
    Ball(Rechteck m_form){
        form = m_form;
    }

    public void bewegen(int anzahlFrames){
        form.verschiebe(bewegungInXProFrame * anzahlFrames, bewegungInYProFrame * anzahlFrames);
    }
    



}
