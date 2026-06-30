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

public class ProfileResp_setSumTechAdvancedHighScore_158988050544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98360;
     Object term98399;

    public ProfileResp_setSumTechAdvancedHighScore_158988050544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98360 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98360, term98360.getClass(), "userName", "VGKRiEyTvE");
        setIntField(term98360, term98360.getClass(), "level", 1149410612);
        setLongField(term98360, term98360.getClass(), "exp", -3141687489525106813L);
        setLongField(term98360, term98360.getClass(), "point", 3674968935893434172L);
        setLongField(term98360, term98360.getClass(), "totalPoint", -4948608045371758090L);
        setIntField(term98360, term98360.getClass(), "playCount", 1022860415);
        setIntField(term98360, term98360.getClass(), "jewelCount", 446459321);
        setIntField(term98360, term98360.getClass(), "totalJewelCount", 1746162639);
        setIntField(term98360, term98360.getClass(), "playerRating", -1236912032);
        setIntField(term98360, term98360.getClass(), "highestRating", -22958260);
        setIntField(term98360, term98360.getClass(), "battlePoint", 796165078);
        setIntField(term98360, term98360.getClass(), "nameplateId", 1459197610);
        setIntField(term98360, term98360.getClass(), "trophyId", -429720577);
        setIntField(term98360, term98360.getClass(), "cardId", -2011363019);
        setIntField(term98360, term98360.getClass(), "characterId", 1331638094);
        setLongField(term98360, term98360.getClass(), "sumTechHighScore", 7290181375514940963L);
        setLongField(term98360, term98360.getClass(), "sumTechBasicHighScore", 7809203922794704939L);
        setLongField(term98360, term98360.getClass(), "sumTechAdvancedHighScore", -2374048218341379066L);
        setLongField(term98360, term98360.getClass(), "sumTechExpertHighScore", -5655634345080714479L);
        setLongField(term98360, term98360.getClass(), "sumTechMasterHighScore", 5099454980169140885L);
        setLongField(term98360, term98360.getClass(), "sumTechLunaticHighScore", -1003542830785449576L);
        setLongField(term98360, term98360.getClass(), "sumBattleHighScore", -996250085480298262L);
        setLongField(term98360, term98360.getClass(), "sumBattleBasicHighScore", 1833599522965636758L);
        setLongField(term98360, term98360.getClass(), "sumBattleAdvancedHighScore", 9052837432546483731L);
        setLongField(term98360, term98360.getClass(), "sumBattleExpertHighScore", 720893526583298286L);
        setLongField(term98360, term98360.getClass(), "sumBattleMasterHighScore", -7231097584212090931L);
        setLongField(term98360, term98360.getClass(), "sumBattleLunaticHighScore", -2451137721126559250L);
        term98399 = new Long(-7142079422361265774L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98399;
        callMethod(klass, "setSumTechAdvancedHighScore", argTypes, term98360, args);
    }

};


