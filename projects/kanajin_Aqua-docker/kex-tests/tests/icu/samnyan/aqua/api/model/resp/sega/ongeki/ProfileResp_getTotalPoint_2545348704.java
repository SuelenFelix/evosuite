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

public class ProfileResp_getTotalPoint_2545348704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96346;

    public ProfileResp_getTotalPoint_2545348704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96346 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96346, term96346.getClass(), "userName", "xTEoNTnhsZ");
        setIntField(term96346, term96346.getClass(), "level", -1369396791);
        setLongField(term96346, term96346.getClass(), "exp", -9002339416922780492L);
        setLongField(term96346, term96346.getClass(), "point", -6776275349293942429L);
        setLongField(term96346, term96346.getClass(), "totalPoint", -1947321649183924709L);
        setIntField(term96346, term96346.getClass(), "playCount", -251990977);
        setIntField(term96346, term96346.getClass(), "jewelCount", -547795089);
        setIntField(term96346, term96346.getClass(), "totalJewelCount", 2110538741);
        setIntField(term96346, term96346.getClass(), "playerRating", -1982370512);
        setIntField(term96346, term96346.getClass(), "highestRating", 1448071348);
        setIntField(term96346, term96346.getClass(), "battlePoint", -8590384);
        setIntField(term96346, term96346.getClass(), "nameplateId", 925031177);
        setIntField(term96346, term96346.getClass(), "trophyId", 711912801);
        setIntField(term96346, term96346.getClass(), "cardId", -696791964);
        setIntField(term96346, term96346.getClass(), "characterId", 1329820222);
        setLongField(term96346, term96346.getClass(), "sumTechHighScore", 3831143152556333320L);
        setLongField(term96346, term96346.getClass(), "sumTechBasicHighScore", 6804695143803839571L);
        setLongField(term96346, term96346.getClass(), "sumTechAdvancedHighScore", -3830405672068422634L);
        setLongField(term96346, term96346.getClass(), "sumTechExpertHighScore", -8064870071028325494L);
        setLongField(term96346, term96346.getClass(), "sumTechMasterHighScore", -1684585402235114857L);
        setLongField(term96346, term96346.getClass(), "sumTechLunaticHighScore", 3907394296245329186L);
        setLongField(term96346, term96346.getClass(), "sumBattleHighScore", 1794472426796529632L);
        setLongField(term96346, term96346.getClass(), "sumBattleBasicHighScore", 2938661221832723053L);
        setLongField(term96346, term96346.getClass(), "sumBattleAdvancedHighScore", 2571290489779623157L);
        setLongField(term96346, term96346.getClass(), "sumBattleExpertHighScore", -6275765097861644360L);
        setLongField(term96346, term96346.getClass(), "sumBattleMasterHighScore", 8443534845334408491L);
        setLongField(term96346, term96346.getClass(), "sumBattleLunaticHighScore", 8975154494311168906L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term96346, args);
    }

};


