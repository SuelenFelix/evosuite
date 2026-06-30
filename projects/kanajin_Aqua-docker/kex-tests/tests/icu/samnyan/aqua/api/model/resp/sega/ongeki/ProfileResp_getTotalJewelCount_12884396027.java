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

public class ProfileResp_getTotalJewelCount_12884396027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96493;

    public ProfileResp_getTotalJewelCount_12884396027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96493 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96493, term96493.getClass(), "userName", "dfLHBCBPQe");
        setIntField(term96493, term96493.getClass(), "level", -887412445);
        setLongField(term96493, term96493.getClass(), "exp", 3617115730171050714L);
        setLongField(term96493, term96493.getClass(), "point", 6497582195726114729L);
        setLongField(term96493, term96493.getClass(), "totalPoint", -3214348502059634465L);
        setIntField(term96493, term96493.getClass(), "playCount", 35374019);
        setIntField(term96493, term96493.getClass(), "jewelCount", 40688881);
        setIntField(term96493, term96493.getClass(), "totalJewelCount", 854227727);
        setIntField(term96493, term96493.getClass(), "playerRating", 188975612);
        setIntField(term96493, term96493.getClass(), "highestRating", 579552802);
        setIntField(term96493, term96493.getClass(), "battlePoint", 1066214745);
        setIntField(term96493, term96493.getClass(), "nameplateId", 1685320551);
        setIntField(term96493, term96493.getClass(), "trophyId", -349682771);
        setIntField(term96493, term96493.getClass(), "cardId", 168090109);
        setIntField(term96493, term96493.getClass(), "characterId", 35914595);
        setLongField(term96493, term96493.getClass(), "sumTechHighScore", -1505397547266367181L);
        setLongField(term96493, term96493.getClass(), "sumTechBasicHighScore", 2243354548018435980L);
        setLongField(term96493, term96493.getClass(), "sumTechAdvancedHighScore", 511935443347160104L);
        setLongField(term96493, term96493.getClass(), "sumTechExpertHighScore", 620320792988185737L);
        setLongField(term96493, term96493.getClass(), "sumTechMasterHighScore", -5794386543936842110L);
        setLongField(term96493, term96493.getClass(), "sumTechLunaticHighScore", 5545591278736168224L);
        setLongField(term96493, term96493.getClass(), "sumBattleHighScore", -5531478394066203067L);
        setLongField(term96493, term96493.getClass(), "sumBattleBasicHighScore", 7795568939646221859L);
        setLongField(term96493, term96493.getClass(), "sumBattleAdvancedHighScore", -5078431915868355065L);
        setLongField(term96493, term96493.getClass(), "sumBattleExpertHighScore", 6735596149732177421L);
        setLongField(term96493, term96493.getClass(), "sumBattleMasterHighScore", -4388921639678593613L);
        setLongField(term96493, term96493.getClass(), "sumBattleLunaticHighScore", -8100617172874490521L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalJewelCount", argTypes, term96493, args);
    }

};


