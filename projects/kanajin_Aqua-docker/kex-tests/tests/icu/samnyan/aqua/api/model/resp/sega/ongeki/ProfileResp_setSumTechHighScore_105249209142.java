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

public class ProfileResp_setSumTechHighScore_105249209142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98258;
     Object term98297;

    public ProfileResp_setSumTechHighScore_105249209142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98258 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98258, term98258.getClass(), "userName", "GSDNcmjnrW");
        setIntField(term98258, term98258.getClass(), "level", -1328018013);
        setLongField(term98258, term98258.getClass(), "exp", 8806099566144028503L);
        setLongField(term98258, term98258.getClass(), "point", 8801542229673977841L);
        setLongField(term98258, term98258.getClass(), "totalPoint", -559935473251034829L);
        setIntField(term98258, term98258.getClass(), "playCount", -539856714);
        setIntField(term98258, term98258.getClass(), "jewelCount", -2147201865);
        setIntField(term98258, term98258.getClass(), "totalJewelCount", -491526827);
        setIntField(term98258, term98258.getClass(), "playerRating", 363876833);
        setIntField(term98258, term98258.getClass(), "highestRating", -932788417);
        setIntField(term98258, term98258.getClass(), "battlePoint", 192114198);
        setIntField(term98258, term98258.getClass(), "nameplateId", 142709358);
        setIntField(term98258, term98258.getClass(), "trophyId", -1211982996);
        setIntField(term98258, term98258.getClass(), "cardId", -320319205);
        setIntField(term98258, term98258.getClass(), "characterId", -1467745274);
        setLongField(term98258, term98258.getClass(), "sumTechHighScore", 4215971209256795531L);
        setLongField(term98258, term98258.getClass(), "sumTechBasicHighScore", -2720662516023225508L);
        setLongField(term98258, term98258.getClass(), "sumTechAdvancedHighScore", 6875381188527633650L);
        setLongField(term98258, term98258.getClass(), "sumTechExpertHighScore", 4693628667129828286L);
        setLongField(term98258, term98258.getClass(), "sumTechMasterHighScore", -5868502002860539084L);
        setLongField(term98258, term98258.getClass(), "sumTechLunaticHighScore", 7207360941494127108L);
        setLongField(term98258, term98258.getClass(), "sumBattleHighScore", -5144130457931959162L);
        setLongField(term98258, term98258.getClass(), "sumBattleBasicHighScore", -1169804476297780862L);
        setLongField(term98258, term98258.getClass(), "sumBattleAdvancedHighScore", 331808579972926160L);
        setLongField(term98258, term98258.getClass(), "sumBattleExpertHighScore", -1227200230278255275L);
        setLongField(term98258, term98258.getClass(), "sumBattleMasterHighScore", -2271649408838336402L);
        setLongField(term98258, term98258.getClass(), "sumBattleLunaticHighScore", 1478570841635730121L);
        term98297 = new Long(1341096111951622964L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98297;
        callMethod(klass, "setSumTechHighScore", argTypes, term98258, args);
    }

};


