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

public class ProfileResp_toString_183459253957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99019;

    public ProfileResp_toString_183459253957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99019 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term99019, term99019.getClass(), "userName", "FUWbCKQMTT");
        setIntField(term99019, term99019.getClass(), "level", 1091310257);
        setLongField(term99019, term99019.getClass(), "exp", -965458151232820922L);
        setLongField(term99019, term99019.getClass(), "point", 5215506032197914479L);
        setLongField(term99019, term99019.getClass(), "totalPoint", 131654066409249687L);
        setIntField(term99019, term99019.getClass(), "playCount", -1197485135);
        setIntField(term99019, term99019.getClass(), "jewelCount", 179779239);
        setIntField(term99019, term99019.getClass(), "totalJewelCount", 1520232412);
        setIntField(term99019, term99019.getClass(), "playerRating", 1066566576);
        setIntField(term99019, term99019.getClass(), "highestRating", -163112105);
        setIntField(term99019, term99019.getClass(), "battlePoint", 320468454);
        setIntField(term99019, term99019.getClass(), "nameplateId", 232349751);
        setIntField(term99019, term99019.getClass(), "trophyId", 1894995620);
        setIntField(term99019, term99019.getClass(), "cardId", 567244523);
        setIntField(term99019, term99019.getClass(), "characterId", -758396509);
        setLongField(term99019, term99019.getClass(), "sumTechHighScore", 1394969516836522821L);
        setLongField(term99019, term99019.getClass(), "sumTechBasicHighScore", 2173841757053309004L);
        setLongField(term99019, term99019.getClass(), "sumTechAdvancedHighScore", 6401051327599477407L);
        setLongField(term99019, term99019.getClass(), "sumTechExpertHighScore", -3191049865453803215L);
        setLongField(term99019, term99019.getClass(), "sumTechMasterHighScore", 198594267564904326L);
        setLongField(term99019, term99019.getClass(), "sumTechLunaticHighScore", 4413694577249991128L);
        setLongField(term99019, term99019.getClass(), "sumBattleHighScore", 8238799625333743619L);
        setLongField(term99019, term99019.getClass(), "sumBattleBasicHighScore", 6745703176595847065L);
        setLongField(term99019, term99019.getClass(), "sumBattleAdvancedHighScore", -1861570730684690495L);
        setLongField(term99019, term99019.getClass(), "sumBattleExpertHighScore", -7829714155702753830L);
        setLongField(term99019, term99019.getClass(), "sumBattleMasterHighScore", -9056178451018942479L);
        setLongField(term99019, term99019.getClass(), "sumBattleLunaticHighScore", -3285142858858216817L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term99019, args);
    }

};


