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

public class ProfileResp_setNameplateId_143913454638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98054;
     Object term98093;

    public ProfileResp_setNameplateId_143913454638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98054 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98054, term98054.getClass(), "userName", "VtkumdeGYO");
        setIntField(term98054, term98054.getClass(), "level", -1724210968);
        setLongField(term98054, term98054.getClass(), "exp", 8458799473402607993L);
        setLongField(term98054, term98054.getClass(), "point", 8970805257538274789L);
        setLongField(term98054, term98054.getClass(), "totalPoint", 6281105533559213502L);
        setIntField(term98054, term98054.getClass(), "playCount", -1009071033);
        setIntField(term98054, term98054.getClass(), "jewelCount", -1736858487);
        setIntField(term98054, term98054.getClass(), "totalJewelCount", -595268504);
        setIntField(term98054, term98054.getClass(), "playerRating", 1825456872);
        setIntField(term98054, term98054.getClass(), "highestRating", 1789979680);
        setIntField(term98054, term98054.getClass(), "battlePoint", -523619566);
        setIntField(term98054, term98054.getClass(), "nameplateId", 261762175);
        setIntField(term98054, term98054.getClass(), "trophyId", 739203659);
        setIntField(term98054, term98054.getClass(), "cardId", 293964561);
        setIntField(term98054, term98054.getClass(), "characterId", -704904230);
        setLongField(term98054, term98054.getClass(), "sumTechHighScore", 2589075544171488343L);
        setLongField(term98054, term98054.getClass(), "sumTechBasicHighScore", -2524034011111272656L);
        setLongField(term98054, term98054.getClass(), "sumTechAdvancedHighScore", -3701209150107001555L);
        setLongField(term98054, term98054.getClass(), "sumTechExpertHighScore", 8660851427938657818L);
        setLongField(term98054, term98054.getClass(), "sumTechMasterHighScore", -1744416112697400313L);
        setLongField(term98054, term98054.getClass(), "sumTechLunaticHighScore", -5227612795135395313L);
        setLongField(term98054, term98054.getClass(), "sumBattleHighScore", 4149941746833459320L);
        setLongField(term98054, term98054.getClass(), "sumBattleBasicHighScore", -1254056169428667308L);
        setLongField(term98054, term98054.getClass(), "sumBattleAdvancedHighScore", 6581550333189101837L);
        setLongField(term98054, term98054.getClass(), "sumBattleExpertHighScore", 5606820790473917567L);
        setLongField(term98054, term98054.getClass(), "sumBattleMasterHighScore", 2222570641313690254L);
        setLongField(term98054, term98054.getClass(), "sumBattleLunaticHighScore", -9086054091297879205L);
        term98093 = new Integer(-979479163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term98093;
        callMethod(klass, "setNameplateId", argTypes, term98054, args);
    }

};


