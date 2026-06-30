package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserData_setTotalJewelCount_173151259072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52458;
     Object term52721;

    public UserData_setTotalJewelCount_173151259072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52462 = new Long(-900457279156388404L);
        term52458 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term52460 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52491 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52458, term52458.getClass(), "id", 2356364798178675182L);
        setLongField(term52460, term52460.getClass(), "id", 7063501880932248824L);
        setField(term52460, term52460.getClass(), "extId", term52462);
        setField(term52460, term52460.getClass(), "luid", "WJosrfBMfA");
        setIntField(term52477, term52477.getClass(), "year", 2025);
        setShortField(term52477, term52477.getClass(), "month", (short) 1);
        setShortField(term52477, term52477.getClass(), "day", (short) 20);
        setField(term52476, term52476.getClass(), "date", term52477);
        setByteField(term52481, term52481.getClass(), "hour", (byte) 22);
        setByteField(term52481, term52481.getClass(), "minute", (byte) 55);
        setByteField(term52481, term52481.getClass(), "second", (byte) 9);
        setIntField(term52481, term52481.getClass(), "nano", 660955568);
        setField(term52476, term52476.getClass(), "time", term52481);
        setField(term52460, term52460.getClass(), "registerTime", term52476);
        setIntField(term52487, term52487.getClass(), "year", 2014);
        setShortField(term52487, term52487.getClass(), "month", (short) 2);
        setShortField(term52487, term52487.getClass(), "day", (short) 26);
        setField(term52486, term52486.getClass(), "date", term52487);
        setByteField(term52491, term52491.getClass(), "hour", (byte) 16);
        setByteField(term52491, term52491.getClass(), "minute", (byte) 42);
        setByteField(term52491, term52491.getClass(), "second", (byte) 39);
        setIntField(term52491, term52491.getClass(), "nano", 690212071);
        setField(term52486, term52486.getClass(), "time", term52491);
        setField(term52460, term52460.getClass(), "accessTime", term52486);
        setField(term52458, term52458.getClass(), "card", term52460);
        setField(term52458, term52458.getClass(), "userName", "ttlGywalKc");
        setIntField(term52458, term52458.getClass(), "level", -1101871231);
        setIntField(term52458, term52458.getClass(), "reincarnationNum", 928527949);
        setLongField(term52458, term52458.getClass(), "exp", 8782042393246212473L);
        setLongField(term52458, term52458.getClass(), "point", -5149906517600309652L);
        setLongField(term52458, term52458.getClass(), "totalPoint", -2412920067936514032L);
        setIntField(term52458, term52458.getClass(), "playCount", 435463871);
        setIntField(term52458, term52458.getClass(), "jewelCount", -72892619);
        setIntField(term52458, term52458.getClass(), "totalJewelCount", 907161445);
        setIntField(term52458, term52458.getClass(), "medalCount", -107125345);
        setIntField(term52458, term52458.getClass(), "playerRating", -1484271501);
        setIntField(term52458, term52458.getClass(), "highestRating", 1994800842);
        setIntField(term52458, term52458.getClass(), "battlePoint", 418349525);
        setIntField(term52458, term52458.getClass(), "bestBattlePoint", 989214721);
        setIntField(term52458, term52458.getClass(), "overDamageBattlePoint", 1509604);
        setBooleanField(term52458, term52458.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term52458, term52458.getClass(), "nameplateId", 516929449);
        setIntField(term52458, term52458.getClass(), "trophyId", 86726117);
        setIntField(term52458, term52458.getClass(), "cardId", -142908686);
        setIntField(term52458, term52458.getClass(), "characterId", 780437076);
        setIntField(term52458, term52458.getClass(), "characterVoiceNo", -1290991126);
        setIntField(term52458, term52458.getClass(), "tabSetting", 1579548215);
        setIntField(term52458, term52458.getClass(), "tabSortSetting", 518866176);
        setIntField(term52458, term52458.getClass(), "cardCategorySetting", -1352533284);
        setIntField(term52458, term52458.getClass(), "cardSortSetting", -149022151);
        setIntField(term52458, term52458.getClass(), "rivalScoreCategorySetting", -2128082017);
        setIntField(term52458, term52458.getClass(), "playedTutorialBit", -626860638);
        setIntField(term52458, term52458.getClass(), "firstTutorialCancelNum", 969445811);
        setLongField(term52458, term52458.getClass(), "sumTechHighScore", -1760891577100845054L);
        setLongField(term52458, term52458.getClass(), "sumTechBasicHighScore", 2614185242023314675L);
        setLongField(term52458, term52458.getClass(), "sumTechAdvancedHighScore", 178361842517537670L);
        setLongField(term52458, term52458.getClass(), "sumTechExpertHighScore", 8420774984276198981L);
        setLongField(term52458, term52458.getClass(), "sumTechMasterHighScore", 8962086662826420449L);
        setLongField(term52458, term52458.getClass(), "sumTechLunaticHighScore", 4633683327243391760L);
        setLongField(term52458, term52458.getClass(), "sumBattleHighScore", -5857237775500629566L);
        setLongField(term52458, term52458.getClass(), "sumBattleBasicHighScore", 6921894188357771660L);
        setLongField(term52458, term52458.getClass(), "sumBattleAdvancedHighScore", -6433492565384127622L);
        setLongField(term52458, term52458.getClass(), "sumBattleExpertHighScore", 2886519650889727392L);
        setLongField(term52458, term52458.getClass(), "sumBattleMasterHighScore", 3988621885328354087L);
        setLongField(term52458, term52458.getClass(), "sumBattleLunaticHighScore", -8785640072434283607L);
        setField(term52458, term52458.getClass(), "eventWatchedDate", "rQFBspqBzf");
        setField(term52458, term52458.getClass(), "cmEventWatchedDate", "FmWhAOGAMI");
        setField(term52458, term52458.getClass(), "firstGameId", "GdjCkRsIrS");
        setField(term52458, term52458.getClass(), "firstRomVersion", "MJNyYzLhkh");
        setField(term52458, term52458.getClass(), "firstDataVersion", "DEugGJIaYt");
        setField(term52458, term52458.getClass(), "firstPlayDate", "lzZIObOJmC");
        setField(term52458, term52458.getClass(), "lastGameId", "RFmGKwvSgz");
        setField(term52458, term52458.getClass(), "lastRomVersion", "EUEUhZglna");
        setField(term52458, term52458.getClass(), "lastDataVersion", "znDPtjpZrG");
        setField(term52458, term52458.getClass(), "compatibleCmVersion", "uodLjxczjr");
        setField(term52458, term52458.getClass(), "lastPlayDate", "HJLVBQAtGs");
        setIntField(term52458, term52458.getClass(), "lastPlaceId", -1232355383);
        setField(term52458, term52458.getClass(), "lastPlaceName", "dxAxECMYEm");
        setIntField(term52458, term52458.getClass(), "lastRegionId", 1599985157);
        setField(term52458, term52458.getClass(), "lastRegionName", "ylGHeywyhx");
        setIntField(term52458, term52458.getClass(), "lastAllNetId", 80735812);
        setField(term52458, term52458.getClass(), "lastClientId", "SqMpUczXhg");
        setIntField(term52458, term52458.getClass(), "lastUsedDeckId", 1616706735);
        setIntField(term52458, term52458.getClass(), "lastPlayMusicLevel", -445244024);
        setIntField(term52458, term52458.getClass(), "lastEmoneyBrand", -1836568689);
        term52721 = new Integer(367237282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52721;
        callMethod(klass, "setTotalJewelCount", argTypes, term52458, args);
    }

};


