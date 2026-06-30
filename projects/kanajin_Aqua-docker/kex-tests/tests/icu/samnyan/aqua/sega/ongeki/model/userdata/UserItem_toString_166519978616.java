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

public class UserItem_toString_166519978616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109881;

    public UserItem_toString_166519978616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109887 = new Long(-3277773415369003529L);
        term109881 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term109883 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term109885 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term109901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109906 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109916 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term109881, term109881.getClass(), "id", 2530727598607906762L);
        setLongField(term109883, term109883.getClass(), "id", -2597592144853921265L);
        setLongField(term109885, term109885.getClass(), "id", -8521325756515386498L);
        setField(term109885, term109885.getClass(), "extId", term109887);
        setField(term109885, term109885.getClass(), "luid", "zAkmDkobmH");
        setIntField(term109902, term109902.getClass(), "year", 2020);
        setShortField(term109902, term109902.getClass(), "month", (short) 12);
        setShortField(term109902, term109902.getClass(), "day", (short) 10);
        setField(term109901, term109901.getClass(), "date", term109902);
        setByteField(term109906, term109906.getClass(), "hour", (byte) 3);
        setByteField(term109906, term109906.getClass(), "minute", (byte) 40);
        setByteField(term109906, term109906.getClass(), "second", (byte) 14);
        setIntField(term109906, term109906.getClass(), "nano", 879978907);
        setField(term109901, term109901.getClass(), "time", term109906);
        setField(term109885, term109885.getClass(), "registerTime", term109901);
        setIntField(term109912, term109912.getClass(), "year", 2010);
        setShortField(term109912, term109912.getClass(), "month", (short) 3);
        setShortField(term109912, term109912.getClass(), "day", (short) 31);
        setField(term109911, term109911.getClass(), "date", term109912);
        setByteField(term109916, term109916.getClass(), "hour", (byte) 17);
        setByteField(term109916, term109916.getClass(), "minute", (byte) 7);
        setByteField(term109916, term109916.getClass(), "second", (byte) 55);
        setIntField(term109916, term109916.getClass(), "nano", 725965566);
        setField(term109911, term109911.getClass(), "time", term109916);
        setField(term109885, term109885.getClass(), "accessTime", term109911);
        setField(term109883, term109883.getClass(), "card", term109885);
        setField(term109883, term109883.getClass(), "userName", "FASdrZqBfN");
        setIntField(term109883, term109883.getClass(), "level", 47561810);
        setIntField(term109883, term109883.getClass(), "reincarnationNum", -1708484817);
        setLongField(term109883, term109883.getClass(), "exp", 6474942275917422051L);
        setLongField(term109883, term109883.getClass(), "point", 4247659213519223373L);
        setLongField(term109883, term109883.getClass(), "totalPoint", -296476928996372669L);
        setIntField(term109883, term109883.getClass(), "playCount", 574829358);
        setIntField(term109883, term109883.getClass(), "jewelCount", 179028147);
        setIntField(term109883, term109883.getClass(), "totalJewelCount", -1077334778);
        setIntField(term109883, term109883.getClass(), "medalCount", -845040092);
        setIntField(term109883, term109883.getClass(), "playerRating", -1659873585);
        setIntField(term109883, term109883.getClass(), "highestRating", 1881072097);
        setIntField(term109883, term109883.getClass(), "battlePoint", 1677550181);
        setIntField(term109883, term109883.getClass(), "bestBattlePoint", 1710291513);
        setIntField(term109883, term109883.getClass(), "overDamageBattlePoint", -464025782);
        setBooleanField(term109883, term109883.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term109883, term109883.getClass(), "nameplateId", -1392716182);
        setIntField(term109883, term109883.getClass(), "trophyId", -251208414);
        setIntField(term109883, term109883.getClass(), "cardId", 2058785706);
        setIntField(term109883, term109883.getClass(), "characterId", -1996745891);
        setIntField(term109883, term109883.getClass(), "characterVoiceNo", 615988012);
        setIntField(term109883, term109883.getClass(), "tabSetting", -2129409800);
        setIntField(term109883, term109883.getClass(), "tabSortSetting", -522844088);
        setIntField(term109883, term109883.getClass(), "cardCategorySetting", 1867429949);
        setIntField(term109883, term109883.getClass(), "cardSortSetting", 1323279910);
        setIntField(term109883, term109883.getClass(), "rivalScoreCategorySetting", 1526554078);
        setIntField(term109883, term109883.getClass(), "playedTutorialBit", 119754400);
        setIntField(term109883, term109883.getClass(), "firstTutorialCancelNum", -1149597715);
        setLongField(term109883, term109883.getClass(), "sumTechHighScore", 1927259353051624285L);
        setLongField(term109883, term109883.getClass(), "sumTechBasicHighScore", 2269810715973470447L);
        setLongField(term109883, term109883.getClass(), "sumTechAdvancedHighScore", 2074310247922885552L);
        setLongField(term109883, term109883.getClass(), "sumTechExpertHighScore", 7164501104889735038L);
        setLongField(term109883, term109883.getClass(), "sumTechMasterHighScore", -4035005105175421014L);
        setLongField(term109883, term109883.getClass(), "sumTechLunaticHighScore", 663332377552363646L);
        setLongField(term109883, term109883.getClass(), "sumBattleHighScore", 4503825086123868368L);
        setLongField(term109883, term109883.getClass(), "sumBattleBasicHighScore", 1115062833068978142L);
        setLongField(term109883, term109883.getClass(), "sumBattleAdvancedHighScore", 3131583923379710930L);
        setLongField(term109883, term109883.getClass(), "sumBattleExpertHighScore", 1005731301559613328L);
        setLongField(term109883, term109883.getClass(), "sumBattleMasterHighScore", 4436561124357681867L);
        setLongField(term109883, term109883.getClass(), "sumBattleLunaticHighScore", 7785246707179468138L);
        setField(term109883, term109883.getClass(), "eventWatchedDate", "YNwqJgOcWq");
        setField(term109883, term109883.getClass(), "cmEventWatchedDate", "tUcoJjDoJV");
        setField(term109883, term109883.getClass(), "firstGameId", "ICNsClDoAn");
        setField(term109883, term109883.getClass(), "firstRomVersion", "LACfLkaJjq");
        setField(term109883, term109883.getClass(), "firstDataVersion", "OhYEjeUQkK");
        setField(term109883, term109883.getClass(), "firstPlayDate", "rgZeldfAMO");
        setField(term109883, term109883.getClass(), "lastGameId", "btsBDylBZe");
        setField(term109883, term109883.getClass(), "lastRomVersion", "eAWJddaxnT");
        setField(term109883, term109883.getClass(), "lastDataVersion", "PyaMftIAzC");
        setField(term109883, term109883.getClass(), "compatibleCmVersion", "QiSmNdQUzl");
        setField(term109883, term109883.getClass(), "lastPlayDate", "FsjVOWFhLi");
        setIntField(term109883, term109883.getClass(), "lastPlaceId", 1709518907);
        setField(term109883, term109883.getClass(), "lastPlaceName", "RReQXZQnIR");
        setIntField(term109883, term109883.getClass(), "lastRegionId", -1687052168);
        setField(term109883, term109883.getClass(), "lastRegionName", "VnHgyPgIAn");
        setIntField(term109883, term109883.getClass(), "lastAllNetId", -2097023139);
        setField(term109883, term109883.getClass(), "lastClientId", "EIkLuLTIDO");
        setIntField(term109883, term109883.getClass(), "lastUsedDeckId", -1867947821);
        setIntField(term109883, term109883.getClass(), "lastPlayMusicLevel", 561665845);
        setIntField(term109883, term109883.getClass(), "lastEmoneyBrand", -283888175);
        setField(term109881, term109881.getClass(), "user", term109883);
        setIntField(term109881, term109881.getClass(), "itemKind", 277022954);
        setIntField(term109881, term109881.getClass(), "itemId", -1539323257);
        setIntField(term109881, term109881.getClass(), "stock", -1696039925);
        setBooleanField(term109881, term109881.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term109881, args);
    }

};


