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

public class UserGameOption_setOptionSet_90707814533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64011;
     Object term64311;

    public UserGameOption_setOptionSet_90707814533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64017 = new Long(1667122142089513324L);
        term64011 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term64013 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term64015 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64068 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64223 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64011, term64011.getClass(), "id", -6104317529539097644L);
        setLongField(term64013, term64013.getClass(), "id", 4456551328322151200L);
        setLongField(term64015, term64015.getClass(), "id", 6700719103019158902L);
        setField(term64015, term64015.getClass(), "extId", term64017);
        setField(term64015, term64015.getClass(), "luid", "wXiUlhXQoC");
        setIntField(term64032, term64032.getClass(), "year", 2026);
        setShortField(term64032, term64032.getClass(), "month", (short) 12);
        setShortField(term64032, term64032.getClass(), "day", (short) 13);
        setField(term64031, term64031.getClass(), "date", term64032);
        setByteField(term64036, term64036.getClass(), "hour", (byte) 12);
        setByteField(term64036, term64036.getClass(), "minute", (byte) 7);
        setByteField(term64036, term64036.getClass(), "second", (byte) 52);
        setIntField(term64036, term64036.getClass(), "nano", 158332280);
        setField(term64031, term64031.getClass(), "time", term64036);
        setField(term64015, term64015.getClass(), "registerTime", term64031);
        setIntField(term64042, term64042.getClass(), "year", 2022);
        setShortField(term64042, term64042.getClass(), "month", (short) 4);
        setShortField(term64042, term64042.getClass(), "day", (short) 28);
        setField(term64041, term64041.getClass(), "date", term64042);
        setByteField(term64046, term64046.getClass(), "hour", (byte) 5);
        setByteField(term64046, term64046.getClass(), "minute", (byte) 17);
        setByteField(term64046, term64046.getClass(), "second", (byte) 39);
        setIntField(term64046, term64046.getClass(), "nano", 883798425);
        setField(term64041, term64041.getClass(), "time", term64046);
        setField(term64015, term64015.getClass(), "accessTime", term64041);
        setField(term64013, term64013.getClass(), "card", term64015);
        setField(term64013, term64013.getClass(), "userName", "gKhmgJzimH");
        setIntField(term64064, term64064.getClass(), "year", 2022);
        setShortField(term64064, term64064.getClass(), "month", (short) 8);
        setShortField(term64064, term64064.getClass(), "day", (short) 26);
        setField(term64063, term64063.getClass(), "date", term64064);
        setByteField(term64068, term64068.getClass(), "hour", (byte) 20);
        setByteField(term64068, term64068.getClass(), "minute", (byte) 26);
        setByteField(term64068, term64068.getClass(), "second", (byte) 55);
        setIntField(term64068, term64068.getClass(), "nano", 380890210);
        setField(term64063, term64063.getClass(), "time", term64068);
        setField(term64013, term64013.getClass(), "lastLoginDate", term64063);
        setBooleanField(term64013, term64013.getClass(), "isWebJoin", false);
        setField(term64013, term64013.getClass(), "webLimitDate", "OzRiWLVXNx");
        setIntField(term64013, term64013.getClass(), "level", 904551854);
        setIntField(term64013, term64013.getClass(), "reincarnationNum", -49272576);
        setField(term64013, term64013.getClass(), "exp", "pktmgYsknu");
        setLongField(term64013, term64013.getClass(), "point", 4224749228659425276L);
        setLongField(term64013, term64013.getClass(), "totalPoint", 8435776473049430167L);
        setIntField(term64013, term64013.getClass(), "playCount", 246585268);
        setIntField(term64013, term64013.getClass(), "multiPlayCount", 1163312144);
        setIntField(term64013, term64013.getClass(), "multiWinCount", 1010014762);
        setIntField(term64013, term64013.getClass(), "requestResCount", -416886439);
        setIntField(term64013, term64013.getClass(), "acceptResCount", -1632599980);
        setIntField(term64013, term64013.getClass(), "successResCount", -445306395);
        setIntField(term64013, term64013.getClass(), "playerRating", -1543037055);
        setIntField(term64013, term64013.getClass(), "highestRating", -150763986);
        setIntField(term64013, term64013.getClass(), "nameplateId", 1946252506);
        setIntField(term64013, term64013.getClass(), "frameId", -1279902182);
        setIntField(term64013, term64013.getClass(), "characterId", -551427938);
        setIntField(term64013, term64013.getClass(), "trophyId", 1334551737);
        setIntField(term64013, term64013.getClass(), "playedTutorialBit", -1187792021);
        setIntField(term64013, term64013.getClass(), "firstTutorialCancelNum", 1724189490);
        setIntField(term64013, term64013.getClass(), "masterTutorialCancelNum", -850819450);
        setIntField(term64013, term64013.getClass(), "totalRepertoireCount", 1652716990);
        setIntField(term64013, term64013.getClass(), "totalMapNum", 958228032);
        setLongField(term64013, term64013.getClass(), "totalHiScore", -8317622314014853309L);
        setLongField(term64013, term64013.getClass(), "totalBasicHighScore", -5603191204578376681L);
        setLongField(term64013, term64013.getClass(), "totalAdvancedHighScore", -2371876403222577001L);
        setLongField(term64013, term64013.getClass(), "totalExpertHighScore", -876052271222651071L);
        setLongField(term64013, term64013.getClass(), "totalMasterHighScore", 3831057373276674685L);
        setIntField(term64125, term64125.getClass(), "year", 2010);
        setShortField(term64125, term64125.getClass(), "month", (short) 6);
        setShortField(term64125, term64125.getClass(), "day", (short) 21);
        setField(term64124, term64124.getClass(), "date", term64125);
        setByteField(term64129, term64129.getClass(), "hour", (byte) 4);
        setByteField(term64129, term64129.getClass(), "minute", (byte) 6);
        setByteField(term64129, term64129.getClass(), "second", (byte) 54);
        setIntField(term64129, term64129.getClass(), "nano", 837855935);
        setField(term64124, term64124.getClass(), "time", term64129);
        setField(term64013, term64013.getClass(), "eventWatchedDate", term64124);
        setIntField(term64013, term64013.getClass(), "friendCount", 624789164);
        setBooleanField(term64013, term64013.getClass(), "isMaimai", false);
        setField(term64013, term64013.getClass(), "firstGameId", "SsMHzYNeji");
        setField(term64013, term64013.getClass(), "firstRomVersion", "wzAFLFdaEQ");
        setField(term64013, term64013.getClass(), "firstDataVersion", "IcbBNUXJqX");
        setIntField(term64173, term64173.getClass(), "year", 2028);
        setShortField(term64173, term64173.getClass(), "month", (short) 10);
        setShortField(term64173, term64173.getClass(), "day", (short) 5);
        setField(term64172, term64172.getClass(), "date", term64173);
        setByteField(term64177, term64177.getClass(), "hour", (byte) 0);
        setByteField(term64177, term64177.getClass(), "minute", (byte) 53);
        setByteField(term64177, term64177.getClass(), "second", (byte) 18);
        setIntField(term64177, term64177.getClass(), "nano", 567999687);
        setField(term64172, term64172.getClass(), "time", term64177);
        setField(term64013, term64013.getClass(), "firstPlayDate", term64172);
        setField(term64013, term64013.getClass(), "lastGameId", "LONFjqAsUp");
        setField(term64013, term64013.getClass(), "lastRomVersion", "tAhydlbSMf");
        setField(term64013, term64013.getClass(), "lastDataVersion", "wNYtcPFyIe");
        setIntField(term64219, term64219.getClass(), "year", 2029);
        setShortField(term64219, term64219.getClass(), "month", (short) 7);
        setShortField(term64219, term64219.getClass(), "day", (short) 30);
        setField(term64218, term64218.getClass(), "date", term64219);
        setByteField(term64223, term64223.getClass(), "hour", (byte) 23);
        setByteField(term64223, term64223.getClass(), "minute", (byte) 35);
        setByteField(term64223, term64223.getClass(), "second", (byte) 35);
        setIntField(term64223, term64223.getClass(), "nano", 848673909);
        setField(term64218, term64218.getClass(), "time", term64223);
        setField(term64013, term64013.getClass(), "lastPlayDate", term64218);
        setIntField(term64013, term64013.getClass(), "lastPlaceId", 117919201);
        setField(term64013, term64013.getClass(), "lastPlaceName", "tlIqgTUSQw");
        setField(term64013, term64013.getClass(), "lastRegionId", "UvweyXjDhG");
        setField(term64013, term64013.getClass(), "lastRegionName", "wnoVhNwdJy");
        setField(term64013, term64013.getClass(), "lastAllNetId", "uQGMBLrmAj");
        setField(term64013, term64013.getClass(), "lastClientId", "vNFaheDeBv");
        setField(term64011, term64011.getClass(), "user", term64013);
        setIntField(term64011, term64011.getClass(), "bgInfo", 1389237948);
        setIntField(term64011, term64011.getClass(), "fieldColor", 866670285);
        setIntField(term64011, term64011.getClass(), "guideSound", -2004076717);
        setIntField(term64011, term64011.getClass(), "soundEffect", -1695237959);
        setIntField(term64011, term64011.getClass(), "guideLine", 1317356126);
        setIntField(term64011, term64011.getClass(), "speed", 2058932005);
        setIntField(term64011, term64011.getClass(), "optionSet", -773196588);
        setIntField(term64011, term64011.getClass(), "matching", -1082451840);
        setIntField(term64011, term64011.getClass(), "judgePos", 120368183);
        setIntField(term64011, term64011.getClass(), "rating", 1721841052);
        setIntField(term64011, term64011.getClass(), "judgeJustice", -1801745263);
        setIntField(term64011, term64011.getClass(), "judgeAttack", 1232286807);
        setIntField(term64011, term64011.getClass(), "headphone", -507386961);
        setIntField(term64011, term64011.getClass(), "playerLevel", -476320083);
        setIntField(term64011, term64011.getClass(), "successTap", -2100928588);
        setIntField(term64011, term64011.getClass(), "successExTap", -81621107);
        setIntField(term64011, term64011.getClass(), "successSlideHold", -1617104329);
        setIntField(term64011, term64011.getClass(), "successAir", -34705122);
        setIntField(term64011, term64011.getClass(), "successFlick", 1705528966);
        setIntField(term64011, term64011.getClass(), "successSkill", 988288101);
        setIntField(term64011, term64011.getClass(), "successTapTimbre", -1408161596);
        setIntField(term64011, term64011.getClass(), "privacy", 1726412898);
        term64311 = new Integer(-669874944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term64311;
        callMethod(klass, "setOptionSet", argTypes, term64011, args);
    }

};


