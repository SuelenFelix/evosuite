package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOptionEx_setExt6_110539440830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323461;
     Object term323759;

    public UserGameOptionEx_setExt6_110539440830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323467 = new Long(3288572082902580031L);
        term323461 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term323463 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term323465 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term323481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323518 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323627 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323668 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323669 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323673 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term323461, term323461.getClass(), "id", -5601362953809626317L);
        setLongField(term323463, term323463.getClass(), "id", -2963343028627970926L);
        setLongField(term323465, term323465.getClass(), "id", -3475893980837884356L);
        setField(term323465, term323465.getClass(), "extId", term323467);
        setField(term323465, term323465.getClass(), "luid", "KXSxokRDON");
        setIntField(term323482, term323482.getClass(), "year", 2014);
        setShortField(term323482, term323482.getClass(), "month", (short) 9);
        setShortField(term323482, term323482.getClass(), "day", (short) 14);
        setField(term323481, term323481.getClass(), "date", term323482);
        setByteField(term323486, term323486.getClass(), "hour", (byte) 18);
        setByteField(term323486, term323486.getClass(), "minute", (byte) 57);
        setByteField(term323486, term323486.getClass(), "second", (byte) 42);
        setIntField(term323486, term323486.getClass(), "nano", 856808956);
        setField(term323481, term323481.getClass(), "time", term323486);
        setField(term323465, term323465.getClass(), "registerTime", term323481);
        setIntField(term323492, term323492.getClass(), "year", 2018);
        setShortField(term323492, term323492.getClass(), "month", (short) 6);
        setShortField(term323492, term323492.getClass(), "day", (short) 18);
        setField(term323491, term323491.getClass(), "date", term323492);
        setByteField(term323496, term323496.getClass(), "hour", (byte) 16);
        setByteField(term323496, term323496.getClass(), "minute", (byte) 54);
        setByteField(term323496, term323496.getClass(), "second", (byte) 14);
        setIntField(term323496, term323496.getClass(), "nano", 77531762);
        setField(term323491, term323491.getClass(), "time", term323496);
        setField(term323465, term323465.getClass(), "accessTime", term323491);
        setField(term323463, term323463.getClass(), "card", term323465);
        setField(term323463, term323463.getClass(), "userName", "eGlkGTQepc");
        setIntField(term323514, term323514.getClass(), "year", 2029);
        setShortField(term323514, term323514.getClass(), "month", (short) 5);
        setShortField(term323514, term323514.getClass(), "day", (short) 1);
        setField(term323513, term323513.getClass(), "date", term323514);
        setByteField(term323518, term323518.getClass(), "hour", (byte) 18);
        setByteField(term323518, term323518.getClass(), "minute", (byte) 51);
        setByteField(term323518, term323518.getClass(), "second", (byte) 43);
        setIntField(term323518, term323518.getClass(), "nano", 646515349);
        setField(term323513, term323513.getClass(), "time", term323518);
        setField(term323463, term323463.getClass(), "lastLoginDate", term323513);
        setBooleanField(term323463, term323463.getClass(), "isWebJoin", true);
        setField(term323463, term323463.getClass(), "webLimitDate", "DcEhRkuwFV");
        setIntField(term323463, term323463.getClass(), "level", 69136499);
        setIntField(term323463, term323463.getClass(), "reincarnationNum", 1571054206);
        setField(term323463, term323463.getClass(), "exp", "bLkMoMyLsr");
        setLongField(term323463, term323463.getClass(), "point", -1973428419727299624L);
        setLongField(term323463, term323463.getClass(), "totalPoint", 4843893817805462778L);
        setIntField(term323463, term323463.getClass(), "playCount", -2018791707);
        setIntField(term323463, term323463.getClass(), "multiPlayCount", 360204701);
        setIntField(term323463, term323463.getClass(), "multiWinCount", -416199794);
        setIntField(term323463, term323463.getClass(), "requestResCount", -850034771);
        setIntField(term323463, term323463.getClass(), "acceptResCount", 1276387384);
        setIntField(term323463, term323463.getClass(), "successResCount", 1478390250);
        setIntField(term323463, term323463.getClass(), "playerRating", -363836860);
        setIntField(term323463, term323463.getClass(), "highestRating", -800919734);
        setIntField(term323463, term323463.getClass(), "nameplateId", 993694845);
        setIntField(term323463, term323463.getClass(), "frameId", -2063030768);
        setIntField(term323463, term323463.getClass(), "characterId", -25263129);
        setIntField(term323463, term323463.getClass(), "trophyId", 1614442195);
        setIntField(term323463, term323463.getClass(), "playedTutorialBit", -1041380867);
        setIntField(term323463, term323463.getClass(), "firstTutorialCancelNum", 1592269612);
        setIntField(term323463, term323463.getClass(), "masterTutorialCancelNum", -1098356486);
        setIntField(term323463, term323463.getClass(), "totalRepertoireCount", 686906286);
        setIntField(term323463, term323463.getClass(), "totalMapNum", -1692759265);
        setLongField(term323463, term323463.getClass(), "totalHiScore", 4337215445562937521L);
        setLongField(term323463, term323463.getClass(), "totalBasicHighScore", -7398757265676461965L);
        setLongField(term323463, term323463.getClass(), "totalAdvancedHighScore", -7596354887491898409L);
        setLongField(term323463, term323463.getClass(), "totalExpertHighScore", 3007092175291433144L);
        setLongField(term323463, term323463.getClass(), "totalMasterHighScore", 8977127578670073786L);
        setIntField(term323575, term323575.getClass(), "year", 2015);
        setShortField(term323575, term323575.getClass(), "month", (short) 3);
        setShortField(term323575, term323575.getClass(), "day", (short) 30);
        setField(term323574, term323574.getClass(), "date", term323575);
        setByteField(term323579, term323579.getClass(), "hour", (byte) 15);
        setByteField(term323579, term323579.getClass(), "minute", (byte) 48);
        setByteField(term323579, term323579.getClass(), "second", (byte) 19);
        setIntField(term323579, term323579.getClass(), "nano", 276920302);
        setField(term323574, term323574.getClass(), "time", term323579);
        setField(term323463, term323463.getClass(), "eventWatchedDate", term323574);
        setIntField(term323463, term323463.getClass(), "friendCount", -744124449);
        setBooleanField(term323463, term323463.getClass(), "isMaimai", false);
        setField(term323463, term323463.getClass(), "firstGameId", "fMTcYTqwCd");
        setField(term323463, term323463.getClass(), "firstRomVersion", "sMWFVIsJMj");
        setField(term323463, term323463.getClass(), "firstDataVersion", "XWepsdWPbm");
        setIntField(term323623, term323623.getClass(), "year", 2020);
        setShortField(term323623, term323623.getClass(), "month", (short) 4);
        setShortField(term323623, term323623.getClass(), "day", (short) 29);
        setField(term323622, term323622.getClass(), "date", term323623);
        setByteField(term323627, term323627.getClass(), "hour", (byte) 6);
        setByteField(term323627, term323627.getClass(), "minute", (byte) 44);
        setByteField(term323627, term323627.getClass(), "second", (byte) 29);
        setIntField(term323627, term323627.getClass(), "nano", 223685112);
        setField(term323622, term323622.getClass(), "time", term323627);
        setField(term323463, term323463.getClass(), "firstPlayDate", term323622);
        setField(term323463, term323463.getClass(), "lastGameId", "zGFPDuDbGy");
        setField(term323463, term323463.getClass(), "lastRomVersion", "DJWFLHPZno");
        setField(term323463, term323463.getClass(), "lastDataVersion", "iwcGksjeEo");
        setIntField(term323669, term323669.getClass(), "year", 2012);
        setShortField(term323669, term323669.getClass(), "month", (short) 3);
        setShortField(term323669, term323669.getClass(), "day", (short) 13);
        setField(term323668, term323668.getClass(), "date", term323669);
        setByteField(term323673, term323673.getClass(), "hour", (byte) 13);
        setByteField(term323673, term323673.getClass(), "minute", (byte) 39);
        setByteField(term323673, term323673.getClass(), "second", (byte) 9);
        setIntField(term323673, term323673.getClass(), "nano", 86372455);
        setField(term323668, term323668.getClass(), "time", term323673);
        setField(term323463, term323463.getClass(), "lastPlayDate", term323668);
        setIntField(term323463, term323463.getClass(), "lastPlaceId", 1671330839);
        setField(term323463, term323463.getClass(), "lastPlaceName", "ftOtxrQrKv");
        setField(term323463, term323463.getClass(), "lastRegionId", "ykbbLncIeH");
        setField(term323463, term323463.getClass(), "lastRegionName", "VGHbXUsaEW");
        setField(term323463, term323463.getClass(), "lastAllNetId", "QrPAoffYrM");
        setField(term323463, term323463.getClass(), "lastClientId", "GdfyxzrJPi");
        setField(term323461, term323461.getClass(), "user", term323463);
        setIntField(term323461, term323461.getClass(), "ext1", 1727775801);
        setIntField(term323461, term323461.getClass(), "ext2", -825889815);
        setIntField(term323461, term323461.getClass(), "ext3", -1914563192);
        setIntField(term323461, term323461.getClass(), "ext4", 31438099);
        setIntField(term323461, term323461.getClass(), "ext5", -1594165729);
        setIntField(term323461, term323461.getClass(), "ext6", 1815043014);
        setIntField(term323461, term323461.getClass(), "ext7", 706656437);
        setIntField(term323461, term323461.getClass(), "ext8", -1367051681);
        setIntField(term323461, term323461.getClass(), "ext9", -1124721171);
        setIntField(term323461, term323461.getClass(), "ext10", -1269067895);
        setIntField(term323461, term323461.getClass(), "ext11", 1439808726);
        setIntField(term323461, term323461.getClass(), "ext12", -243491664);
        setIntField(term323461, term323461.getClass(), "ext13", -2015048732);
        setIntField(term323461, term323461.getClass(), "ext14", -1898608719);
        setIntField(term323461, term323461.getClass(), "ext15", -1343791309);
        setIntField(term323461, term323461.getClass(), "ext16", 1549394146);
        setIntField(term323461, term323461.getClass(), "ext17", 2107404816);
        setIntField(term323461, term323461.getClass(), "ext18", -1685899538);
        setIntField(term323461, term323461.getClass(), "ext19", 1737970975);
        setIntField(term323461, term323461.getClass(), "ext20", 1787372569);
        term323759 = new Integer(684666777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term323759;
        callMethod(klass, "setExt6", argTypes, term323461, args);
    }

};


