package icu.samnyan.aqua.api.model.resp.sega.ongeki;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProfileResp_setExp_13110962729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97595;
     Object term97634;

    public ProfileResp_setExp_13110962729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97595 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97595, term97595.getClass(), "userName", "oMmWgfbmwS");
        setIntField(term97595, term97595.getClass(), "level", 368102809);
        setLongField(term97595, term97595.getClass(), "exp", 9220115466685186411L);
        setLongField(term97595, term97595.getClass(), "point", -4515056768994598922L);
        setLongField(term97595, term97595.getClass(), "totalPoint", 1567123395716472997L);
        setIntField(term97595, term97595.getClass(), "playCount", -731609554);
        setIntField(term97595, term97595.getClass(), "jewelCount", -259150747);
        setIntField(term97595, term97595.getClass(), "totalJewelCount", 496594192);
        setIntField(term97595, term97595.getClass(), "playerRating", 339524209);
        setIntField(term97595, term97595.getClass(), "highestRating", -924219835);
        setIntField(term97595, term97595.getClass(), "battlePoint", -167860126);
        setIntField(term97595, term97595.getClass(), "nameplateId", 892946607);
        setIntField(term97595, term97595.getClass(), "trophyId", -207470269);
        setIntField(term97595, term97595.getClass(), "cardId", 1436249352);
        setIntField(term97595, term97595.getClass(), "characterId", -1662998548);
        setLongField(term97595, term97595.getClass(), "sumTechHighScore", -484036261559284770L);
        setLongField(term97595, term97595.getClass(), "sumTechBasicHighScore", -2243829497490816095L);
        setLongField(term97595, term97595.getClass(), "sumTechAdvancedHighScore", -3438003060752845626L);
        setLongField(term97595, term97595.getClass(), "sumTechExpertHighScore", -4645269763846499772L);
        setLongField(term97595, term97595.getClass(), "sumTechMasterHighScore", -7925928983049200778L);
        setLongField(term97595, term97595.getClass(), "sumTechLunaticHighScore", -7845045886193673082L);
        setLongField(term97595, term97595.getClass(), "sumBattleHighScore", -1486916539285204907L);
        setLongField(term97595, term97595.getClass(), "sumBattleBasicHighScore", -3270549105313342051L);
        setLongField(term97595, term97595.getClass(), "sumBattleAdvancedHighScore", -1424783352963832532L);
        setLongField(term97595, term97595.getClass(), "sumBattleExpertHighScore", 2856057260447665499L);
        setLongField(term97595, term97595.getClass(), "sumBattleMasterHighScore", -1670512845191596240L);
        setLongField(term97595, term97595.getClass(), "sumBattleLunaticHighScore", 2113873483903050708L);
        term97634 = new Long(3231122063265109310L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term97634;
        callMethod(klass, "setExp", argTypes, term97595, args);
    }

};


