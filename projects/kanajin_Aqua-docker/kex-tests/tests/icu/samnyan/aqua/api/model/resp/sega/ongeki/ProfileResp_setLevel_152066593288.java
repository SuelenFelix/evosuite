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
import java.lang.Integer;

public class ProfileResp_setLevel_152066593288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99898;
     Object term99925;

    public ProfileResp_setLevel_152066593288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99898 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term99898, term99898.getClass(), "userName", null);
        setIntField(term99898, term99898.getClass(), "level", 0);
        setLongField(term99898, term99898.getClass(), "exp", 0L);
        setLongField(term99898, term99898.getClass(), "point", 0L);
        setLongField(term99898, term99898.getClass(), "totalPoint", 0L);
        setIntField(term99898, term99898.getClass(), "playCount", 0);
        setIntField(term99898, term99898.getClass(), "jewelCount", 0);
        setIntField(term99898, term99898.getClass(), "totalJewelCount", 0);
        setIntField(term99898, term99898.getClass(), "playerRating", 0);
        setIntField(term99898, term99898.getClass(), "highestRating", 0);
        setIntField(term99898, term99898.getClass(), "battlePoint", 0);
        setIntField(term99898, term99898.getClass(), "nameplateId", 0);
        setIntField(term99898, term99898.getClass(), "trophyId", 0);
        setIntField(term99898, term99898.getClass(), "cardId", 0);
        setIntField(term99898, term99898.getClass(), "characterId", 0);
        setLongField(term99898, term99898.getClass(), "sumTechHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumBattleHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term99898, term99898.getClass(), "sumBattleLunaticHighScore", 0L);
        term99925 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99925;
        callMethod(klass, "setLevel", argTypes, term99898, args);
    }

};


