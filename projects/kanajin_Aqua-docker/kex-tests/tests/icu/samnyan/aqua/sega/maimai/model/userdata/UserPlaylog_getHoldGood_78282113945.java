package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserPlaylog_getHoldGood_78282113945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133631;

    public UserPlaylog_getHoldGood_78282113945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133637 = new Long(7487838449539103993L);
        term133631 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term133633 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term133635 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term133651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133666 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133631, term133631.getClass(), "id", 3831057373276674685L);
        setLongField(term133633, term133633.getClass(), "id", -239911533409145775L);
        setLongField(term133635, term133635.getClass(), "id", -474777108082218360L);
        setField(term133635, term133635.getClass(), "extId", term133637);
        setField(term133635, term133635.getClass(), "luid", "uFZktToTuS");
        setIntField(term133652, term133652.getClass(), "year", 2024);
        setShortField(term133652, term133652.getClass(), "month", (short) 5);
        setShortField(term133652, term133652.getClass(), "day", (short) 2);
        setField(term133651, term133651.getClass(), "date", term133652);
        setByteField(term133656, term133656.getClass(), "hour", (byte) 16);
        setByteField(term133656, term133656.getClass(), "minute", (byte) 41);
        setByteField(term133656, term133656.getClass(), "second", (byte) 21);
        setIntField(term133656, term133656.getClass(), "nano", 463370731);
        setField(term133651, term133651.getClass(), "time", term133656);
        setField(term133635, term133635.getClass(), "registerTime", term133651);
        setIntField(term133662, term133662.getClass(), "year", 2027);
        setShortField(term133662, term133662.getClass(), "month", (short) 10);
        setShortField(term133662, term133662.getClass(), "day", (short) 4);
        setField(term133661, term133661.getClass(), "date", term133662);
        setByteField(term133666, term133666.getClass(), "hour", (byte) 23);
        setByteField(term133666, term133666.getClass(), "minute", (byte) 48);
        setByteField(term133666, term133666.getClass(), "second", (byte) 10);
        setIntField(term133666, term133666.getClass(), "nano", 256586329);
        setField(term133661, term133661.getClass(), "time", term133666);
        setField(term133635, term133635.getClass(), "accessTime", term133661);
        setField(term133633, term133633.getClass(), "card", term133635);
        setIntField(term133633, term133633.getClass(), "lastDataVersion", 1590592660);
        setField(term133633, term133633.getClass(), "userName", "pVpSARCHtf");
        setIntField(term133633, term133633.getClass(), "point", -961432262);
        setIntField(term133633, term133633.getClass(), "totalPoint", 1209212860);
        setIntField(term133633, term133633.getClass(), "iconId", -410679486);
        setIntField(term133633, term133633.getClass(), "nameplateId", -1925224017);
        setIntField(term133633, term133633.getClass(), "frameId", -1707884987);
        setIntField(term133633, term133633.getClass(), "trophyId", -2125421174);
        setIntField(term133633, term133633.getClass(), "playCount", 1829883671);
        setIntField(term133633, term133633.getClass(), "playVsCount", 1045788676);
        setIntField(term133633, term133633.getClass(), "playSyncCount", 1329142128);
        setIntField(term133633, term133633.getClass(), "winCount", 2042557161);
        setIntField(term133633, term133633.getClass(), "helpCount", -341916705);
        setIntField(term133633, term133633.getClass(), "comboCount", 959274379);
        setIntField(term133633, term133633.getClass(), "feverCount", -111125266);
        setIntField(term133633, term133633.getClass(), "totalHiScore", 448697018);
        setIntField(term133633, term133633.getClass(), "totalEasyHighScore", 1716089094);
        setIntField(term133633, term133633.getClass(), "totalBasicHighScore", 934961465);
        setIntField(term133633, term133633.getClass(), "totalAdvancedHighScore", -417012777);
        setIntField(term133633, term133633.getClass(), "totalExpertHighScore", 88517077);
        setIntField(term133633, term133633.getClass(), "totalMasterHighScore", 337947983);
        setIntField(term133633, term133633.getClass(), "totalReMasterHighScore", 68193922);
        setIntField(term133633, term133633.getClass(), "totalHighSync", 1396436320);
        setIntField(term133633, term133633.getClass(), "totalEasySync", -1669072852);
        setIntField(term133633, term133633.getClass(), "totalBasicSync", 102952747);
        setIntField(term133633, term133633.getClass(), "totalAdvancedSync", -953707233);
        setIntField(term133633, term133633.getClass(), "totalExpertSync", 1128790859);
        setIntField(term133633, term133633.getClass(), "totalMasterSync", -1442559952);
        setIntField(term133633, term133633.getClass(), "totalReMasterSync", 2077790798);
        setIntField(term133633, term133633.getClass(), "playerRating", 646275345);
        setIntField(term133633, term133633.getClass(), "highestRating", 163521440);
        setIntField(term133633, term133633.getClass(), "rankAuthTailId", 69136499);
        setField(term133633, term133633.getClass(), "eventWatchedDate", "wnvCIiaAYo");
        setField(term133633, term133633.getClass(), "webLimitDate", "waPCjDLHIu");
        setIntField(term133633, term133633.getClass(), "challengeTrackPhase", 1571054206);
        setIntField(term133633, term133633.getClass(), "firstPlayBits", -2018791707);
        setField(term133633, term133633.getClass(), "lastPlayDate", "ziLgjZfcmc");
        setIntField(term133633, term133633.getClass(), "lastPlaceId", 360204701);
        setField(term133633, term133633.getClass(), "lastPlaceName", "NpOgFaCXxB");
        setIntField(term133633, term133633.getClass(), "lastRegionId", -416199794);
        setField(term133633, term133633.getClass(), "lastRegionName", "xAfHHeOBie");
        setField(term133633, term133633.getClass(), "lastClientId", "NTXawZXYgT");
        setField(term133633, term133633.getClass(), "lastCountryCode", "KrNHXyCftn");
        setIntField(term133633, term133633.getClass(), "eventPoint", -850034771);
        setIntField(term133633, term133633.getClass(), "totalLv", 1276387384);
        setIntField(term133633, term133633.getClass(), "lastLoginBonusDay", 1478390250);
        setIntField(term133633, term133633.getClass(), "lastSurvivalBonusDay", -363836860);
        setIntField(term133633, term133633.getClass(), "loginBonusLv", -800919734);
        setField(term133631, term133631.getClass(), "user", term133633);
        setIntField(term133631, term133631.getClass(), "orderId", 993694845);
        setLongField(term133631, term133631.getClass(), "sortNumber", -7235419481645807819L);
        setIntField(term133631, term133631.getClass(), "placeId", -2063030768);
        setField(term133631, term133631.getClass(), "placeName", "qoZIehoMQV");
        setField(term133631, term133631.getClass(), "country", "mUjsuGJONY");
        setIntField(term133631, term133631.getClass(), "regionId", -25263129);
        setField(term133631, term133631.getClass(), "playDate", "GOumeOeOmE");
        setField(term133631, term133631.getClass(), "userPlayDate", "tYTspNFBci");
        setIntField(term133631, term133631.getClass(), "musicId", 1614442195);
        setIntField(term133631, term133631.getClass(), "level", -1041380867);
        setIntField(term133631, term133631.getClass(), "gameMode", 1592269612);
        setIntField(term133631, term133631.getClass(), "rivalNum", -1098356486);
        setIntField(term133631, term133631.getClass(), "track", 686906286);
        setIntField(term133631, term133631.getClass(), "eventId", -1692759265);
        setBooleanField(term133631, term133631.getClass(), "isFreeToPlay", false);
        setIntField(term133631, term133631.getClass(), "playerRating", -744124449);
        setLongField(term133631, term133631.getClass(), "playedUserId1", -6917021920287966282L);
        setField(term133631, term133631.getClass(), "playedUserName1", "gPqqqLlWBv");
        setIntField(term133631, term133631.getClass(), "playedMusicLevel1", 1671330839);
        setLongField(term133631, term133631.getClass(), "playedUserId2", 4137076813890606231L);
        setField(term133631, term133631.getClass(), "playedUserName2", "IlWYmbzQQL");
        setIntField(term133631, term133631.getClass(), "playedMusicLevel2", 1727775801);
        setLongField(term133631, term133631.getClass(), "playedUserId3", -562805980132245735L);
        setField(term133631, term133631.getClass(), "playedUserName3", "pinoPipukP");
        setIntField(term133631, term133631.getClass(), "playedMusicLevel3", -825889815);
        setIntField(term133631, term133631.getClass(), "achievement", -1914563192);
        setIntField(term133631, term133631.getClass(), "score", 31438099);
        setIntField(term133631, term133631.getClass(), "tapScore", -1594165729);
        setIntField(term133631, term133631.getClass(), "holdScore", 1815043014);
        setIntField(term133631, term133631.getClass(), "slideScore", 706656437);
        setIntField(term133631, term133631.getClass(), "breakScore", -1367051681);
        setIntField(term133631, term133631.getClass(), "syncRate", -1124721171);
        setIntField(term133631, term133631.getClass(), "vsWin", -1269067895);
        setBooleanField(term133631, term133631.getClass(), "isAllPerfect", true);
        setIntField(term133631, term133631.getClass(), "fullCombo", 1439808726);
        setIntField(term133631, term133631.getClass(), "maxFever", -243491664);
        setIntField(term133631, term133631.getClass(), "maxCombo", -2015048732);
        setIntField(term133631, term133631.getClass(), "tapPerfect", -1898608719);
        setIntField(term133631, term133631.getClass(), "tapGreat", -1343791309);
        setIntField(term133631, term133631.getClass(), "tapGood", 1549394146);
        setIntField(term133631, term133631.getClass(), "tapBad", 2107404816);
        setIntField(term133631, term133631.getClass(), "holdPerfect", -1685899538);
        setIntField(term133631, term133631.getClass(), "holdGreat", 1737970975);
        setIntField(term133631, term133631.getClass(), "holdGood", 1787372569);
        setIntField(term133631, term133631.getClass(), "holdBad", 684666777);
        setIntField(term133631, term133631.getClass(), "slidePerfect", 1178569956);
        setIntField(term133631, term133631.getClass(), "slideGreat", -547915411);
        setIntField(term133631, term133631.getClass(), "slideGood", 1768724009);
        setIntField(term133631, term133631.getClass(), "slideBad", 249265496);
        setIntField(term133631, term133631.getClass(), "breakPerfect", 868477230);
        setIntField(term133631, term133631.getClass(), "breakGreat", 1229413667);
        setIntField(term133631, term133631.getClass(), "breakGood", 874120759);
        setIntField(term133631, term133631.getClass(), "breakBad", -552497235);
        setBooleanField(term133631, term133631.getClass(), "isTrackSkip", true);
        setBooleanField(term133631, term133631.getClass(), "isHighScore", false);
        setBooleanField(term133631, term133631.getClass(), "isChallengeTrack", true);
        setIntField(term133631, term133631.getClass(), "challengeLife", -1081656668);
        setIntField(term133631, term133631.getClass(), "challengeRemain", 2146938733);
        setIntField(term133631, term133631.getClass(), "isAllPerfectPlus", 345464224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldGood", argTypes, term133631, args);
    }

};


