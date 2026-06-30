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

public class ProfileResp_getExp_4263746192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96248;

    public ProfileResp_getExp_4263746192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96248 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96248, term96248.getClass(), "userName", "YloyTKwnsE");
        setIntField(term96248, term96248.getClass(), "level", -672659626);
        setLongField(term96248, term96248.getClass(), "exp", -3008410149251298268L);
        setLongField(term96248, term96248.getClass(), "point", 7015893554992153088L);
        setLongField(term96248, term96248.getClass(), "totalPoint", -3900953191164197094L);
        setIntField(term96248, term96248.getClass(), "playCount", 2098080220);
        setIntField(term96248, term96248.getClass(), "jewelCount", 2023147996);
        setIntField(term96248, term96248.getClass(), "totalJewelCount", 2060220804);
        setIntField(term96248, term96248.getClass(), "playerRating", 1584622242);
        setIntField(term96248, term96248.getClass(), "highestRating", -1650881323);
        setIntField(term96248, term96248.getClass(), "battlePoint", -72648238);
        setIntField(term96248, term96248.getClass(), "nameplateId", 1660796709);
        setIntField(term96248, term96248.getClass(), "trophyId", 100478853);
        setIntField(term96248, term96248.getClass(), "cardId", 457416018);
        setIntField(term96248, term96248.getClass(), "characterId", 544763058);
        setLongField(term96248, term96248.getClass(), "sumTechHighScore", 2630163382097206969L);
        setLongField(term96248, term96248.getClass(), "sumTechBasicHighScore", -8916535739221247206L);
        setLongField(term96248, term96248.getClass(), "sumTechAdvancedHighScore", -5472359325859799963L);
        setLongField(term96248, term96248.getClass(), "sumTechExpertHighScore", -7279435562776967072L);
        setLongField(term96248, term96248.getClass(), "sumTechMasterHighScore", -6244588842790418794L);
        setLongField(term96248, term96248.getClass(), "sumTechLunaticHighScore", 8147359926813448411L);
        setLongField(term96248, term96248.getClass(), "sumBattleHighScore", 5943525415630089802L);
        setLongField(term96248, term96248.getClass(), "sumBattleBasicHighScore", -9150205182741930189L);
        setLongField(term96248, term96248.getClass(), "sumBattleAdvancedHighScore", -5646846145666536813L);
        setLongField(term96248, term96248.getClass(), "sumBattleExpertHighScore", 4753048376004329996L);
        setLongField(term96248, term96248.getClass(), "sumBattleMasterHighScore", -2722940564755824775L);
        setLongField(term96248, term96248.getClass(), "sumBattleLunaticHighScore", 722917063797274508L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term96248, args);
    }

};


