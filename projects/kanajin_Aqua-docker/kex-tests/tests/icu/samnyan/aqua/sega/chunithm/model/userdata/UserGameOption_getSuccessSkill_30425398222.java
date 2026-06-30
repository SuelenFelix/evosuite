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

public class UserGameOption_getSuccessSkill_30425398222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58621;

    public UserGameOption_getSuccessSkill_30425398222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58627 = new Long(-1832940336320585644L);
        term58621 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term58623 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term58625 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58833 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58621, term58621.getClass(), "id", -6267867662540638557L);
        setLongField(term58623, term58623.getClass(), "id", 7789239238809338335L);
        setLongField(term58625, term58625.getClass(), "id", 7148416754314775058L);
        setField(term58625, term58625.getClass(), "extId", term58627);
        setField(term58625, term58625.getClass(), "luid", "EUEUhZglna");
        setIntField(term58642, term58642.getClass(), "year", 2023);
        setShortField(term58642, term58642.getClass(), "month", (short) 2);
        setShortField(term58642, term58642.getClass(), "day", (short) 24);
        setField(term58641, term58641.getClass(), "date", term58642);
        setByteField(term58646, term58646.getClass(), "hour", (byte) 13);
        setByteField(term58646, term58646.getClass(), "minute", (byte) 14);
        setByteField(term58646, term58646.getClass(), "second", (byte) 25);
        setIntField(term58646, term58646.getClass(), "nano", 73608340);
        setField(term58641, term58641.getClass(), "time", term58646);
        setField(term58625, term58625.getClass(), "registerTime", term58641);
        setIntField(term58652, term58652.getClass(), "year", 2015);
        setShortField(term58652, term58652.getClass(), "month", (short) 9);
        setShortField(term58652, term58652.getClass(), "day", (short) 8);
        setField(term58651, term58651.getClass(), "date", term58652);
        setByteField(term58656, term58656.getClass(), "hour", (byte) 8);
        setByteField(term58656, term58656.getClass(), "minute", (byte) 25);
        setByteField(term58656, term58656.getClass(), "second", (byte) 10);
        setIntField(term58656, term58656.getClass(), "nano", 506972016);
        setField(term58651, term58651.getClass(), "time", term58656);
        setField(term58625, term58625.getClass(), "accessTime", term58651);
        setField(term58623, term58623.getClass(), "card", term58625);
        setField(term58623, term58623.getClass(), "userName", "znDPtjpZrG");
        setIntField(term58674, term58674.getClass(), "year", 2011);
        setShortField(term58674, term58674.getClass(), "month", (short) 12);
        setShortField(term58674, term58674.getClass(), "day", (short) 10);
        setField(term58673, term58673.getClass(), "date", term58674);
        setByteField(term58678, term58678.getClass(), "hour", (byte) 13);
        setByteField(term58678, term58678.getClass(), "minute", (byte) 50);
        setByteField(term58678, term58678.getClass(), "second", (byte) 43);
        setIntField(term58678, term58678.getClass(), "nano", 632619706);
        setField(term58673, term58673.getClass(), "time", term58678);
        setField(term58623, term58623.getClass(), "lastLoginDate", term58673);
        setBooleanField(term58623, term58623.getClass(), "isWebJoin", true);
        setField(term58623, term58623.getClass(), "webLimitDate", "uodLjxczjr");
        setIntField(term58623, term58623.getClass(), "level", -590979324);
        setIntField(term58623, term58623.getClass(), "reincarnationNum", -1745427158);
        setField(term58623, term58623.getClass(), "exp", "HJLVBQAtGs");
        setLongField(term58623, term58623.getClass(), "point", -5511482978305240721L);
        setLongField(term58623, term58623.getClass(), "totalPoint", 7004919285972689886L);
        setIntField(term58623, term58623.getClass(), "playCount", 1516032954);
        setIntField(term58623, term58623.getClass(), "multiPlayCount", -1945165354);
        setIntField(term58623, term58623.getClass(), "multiWinCount", 14341670);
        setIntField(term58623, term58623.getClass(), "requestResCount", -144022361);
        setIntField(term58623, term58623.getClass(), "acceptResCount", -1419212893);
        setIntField(term58623, term58623.getClass(), "successResCount", -457189882);
        setIntField(term58623, term58623.getClass(), "playerRating", -1227023001);
        setIntField(term58623, term58623.getClass(), "highestRating", -622827471);
        setIntField(term58623, term58623.getClass(), "nameplateId", -1759579486);
        setIntField(term58623, term58623.getClass(), "frameId", 147748970);
        setIntField(term58623, term58623.getClass(), "characterId", -459525196);
        setIntField(term58623, term58623.getClass(), "trophyId", 2129073623);
        setIntField(term58623, term58623.getClass(), "playedTutorialBit", -1623896406);
        setIntField(term58623, term58623.getClass(), "firstTutorialCancelNum", -1767855347);
        setIntField(term58623, term58623.getClass(), "masterTutorialCancelNum", 2061882718);
        setIntField(term58623, term58623.getClass(), "totalRepertoireCount", -263593334);
        setIntField(term58623, term58623.getClass(), "totalMapNum", 257595375);
        setLongField(term58623, term58623.getClass(), "totalHiScore", 7099191052876902273L);
        setLongField(term58623, term58623.getClass(), "totalBasicHighScore", 4098126979899957789L);
        setLongField(term58623, term58623.getClass(), "totalAdvancedHighScore", 1429711781003863063L);
        setLongField(term58623, term58623.getClass(), "totalExpertHighScore", -1033267581061931547L);
        setLongField(term58623, term58623.getClass(), "totalMasterHighScore", 8918321414047974185L);
        setIntField(term58735, term58735.getClass(), "year", 2016);
        setShortField(term58735, term58735.getClass(), "month", (short) 9);
        setShortField(term58735, term58735.getClass(), "day", (short) 16);
        setField(term58734, term58734.getClass(), "date", term58735);
        setByteField(term58739, term58739.getClass(), "hour", (byte) 16);
        setByteField(term58739, term58739.getClass(), "minute", (byte) 33);
        setByteField(term58739, term58739.getClass(), "second", (byte) 2);
        setIntField(term58739, term58739.getClass(), "nano", 767888558);
        setField(term58734, term58734.getClass(), "time", term58739);
        setField(term58623, term58623.getClass(), "eventWatchedDate", term58734);
        setIntField(term58623, term58623.getClass(), "friendCount", 1494109106);
        setBooleanField(term58623, term58623.getClass(), "isMaimai", true);
        setField(term58623, term58623.getClass(), "firstGameId", "dxAxECMYEm");
        setField(term58623, term58623.getClass(), "firstRomVersion", "ylGHeywyhx");
        setField(term58623, term58623.getClass(), "firstDataVersion", "SqMpUczXhg");
        setIntField(term58783, term58783.getClass(), "year", 2019);
        setShortField(term58783, term58783.getClass(), "month", (short) 7);
        setShortField(term58783, term58783.getClass(), "day", (short) 10);
        setField(term58782, term58782.getClass(), "date", term58783);
        setByteField(term58787, term58787.getClass(), "hour", (byte) 4);
        setByteField(term58787, term58787.getClass(), "minute", (byte) 6);
        setByteField(term58787, term58787.getClass(), "second", (byte) 6);
        setIntField(term58787, term58787.getClass(), "nano", 210255351);
        setField(term58782, term58782.getClass(), "time", term58787);
        setField(term58623, term58623.getClass(), "firstPlayDate", term58782);
        setField(term58623, term58623.getClass(), "lastGameId", "voDQuoTpgt");
        setField(term58623, term58623.getClass(), "lastRomVersion", "wgwSIKAsrj");
        setField(term58623, term58623.getClass(), "lastDataVersion", "aGJCHRHyCe");
        setIntField(term58829, term58829.getClass(), "year", 2027);
        setShortField(term58829, term58829.getClass(), "month", (short) 10);
        setShortField(term58829, term58829.getClass(), "day", (short) 8);
        setField(term58828, term58828.getClass(), "date", term58829);
        setByteField(term58833, term58833.getClass(), "hour", (byte) 8);
        setByteField(term58833, term58833.getClass(), "minute", (byte) 53);
        setByteField(term58833, term58833.getClass(), "second", (byte) 13);
        setIntField(term58833, term58833.getClass(), "nano", 464148999);
        setField(term58828, term58828.getClass(), "time", term58833);
        setField(term58623, term58623.getClass(), "lastPlayDate", term58828);
        setIntField(term58623, term58623.getClass(), "lastPlaceId", 1902576230);
        setField(term58623, term58623.getClass(), "lastPlaceName", "WingwhSgfc");
        setField(term58623, term58623.getClass(), "lastRegionId", "YEcmxINfnL");
        setField(term58623, term58623.getClass(), "lastRegionName", "EGytMwlDVe");
        setField(term58623, term58623.getClass(), "lastAllNetId", "GFQCmYZmcg");
        setField(term58623, term58623.getClass(), "lastClientId", "qPgbFtsgtk");
        setField(term58621, term58621.getClass(), "user", term58623);
        setIntField(term58621, term58621.getClass(), "bgInfo", -1040460528);
        setIntField(term58621, term58621.getClass(), "fieldColor", 990725836);
        setIntField(term58621, term58621.getClass(), "guideSound", -1231785501);
        setIntField(term58621, term58621.getClass(), "soundEffect", -2112346885);
        setIntField(term58621, term58621.getClass(), "guideLine", -26311618);
        setIntField(term58621, term58621.getClass(), "speed", -671595545);
        setIntField(term58621, term58621.getClass(), "optionSet", -143541686);
        setIntField(term58621, term58621.getClass(), "matching", -1201234880);
        setIntField(term58621, term58621.getClass(), "judgePos", 1402881126);
        setIntField(term58621, term58621.getClass(), "rating", 786987666);
        setIntField(term58621, term58621.getClass(), "judgeJustice", 1810592574);
        setIntField(term58621, term58621.getClass(), "judgeAttack", 1394978641);
        setIntField(term58621, term58621.getClass(), "headphone", 1085224973);
        setIntField(term58621, term58621.getClass(), "playerLevel", 580824436);
        setIntField(term58621, term58621.getClass(), "successTap", 400588448);
        setIntField(term58621, term58621.getClass(), "successExTap", -798151545);
        setIntField(term58621, term58621.getClass(), "successSlideHold", -243386399);
        setIntField(term58621, term58621.getClass(), "successAir", 1238856040);
        setIntField(term58621, term58621.getClass(), "successFlick", -171442968);
        setIntField(term58621, term58621.getClass(), "successSkill", 1345075451);
        setIntField(term58621, term58621.getClass(), "successTapTimbre", -482097687);
        setIntField(term58621, term58621.getClass(), "privacy", -1155698012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessSkill", argTypes, term58621, args);
    }

};


