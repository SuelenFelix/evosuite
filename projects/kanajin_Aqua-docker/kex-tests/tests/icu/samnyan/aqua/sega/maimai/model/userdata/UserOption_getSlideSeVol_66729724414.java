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

public class UserOption_getSlideSeVol_66729724414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55041;

    public UserOption_getSlideSeVol_66729724414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55047 = new Long(-6673920710396545553L);
        term55041 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term55043 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term55045 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55066 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55076 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55041, term55041.getClass(), "id", 370847120687610747L);
        setLongField(term55043, term55043.getClass(), "id", -6399462725251497844L);
        setLongField(term55045, term55045.getClass(), "id", -4855037955202452256L);
        setField(term55045, term55045.getClass(), "extId", term55047);
        setField(term55045, term55045.getClass(), "luid", "IvYxGwWoVu");
        setIntField(term55062, term55062.getClass(), "year", 2024);
        setShortField(term55062, term55062.getClass(), "month", (short) 11);
        setShortField(term55062, term55062.getClass(), "day", (short) 26);
        setField(term55061, term55061.getClass(), "date", term55062);
        setByteField(term55066, term55066.getClass(), "hour", (byte) 3);
        setByteField(term55066, term55066.getClass(), "minute", (byte) 8);
        setByteField(term55066, term55066.getClass(), "second", (byte) 47);
        setIntField(term55066, term55066.getClass(), "nano", 559634968);
        setField(term55061, term55061.getClass(), "time", term55066);
        setField(term55045, term55045.getClass(), "registerTime", term55061);
        setIntField(term55072, term55072.getClass(), "year", 2018);
        setShortField(term55072, term55072.getClass(), "month", (short) 4);
        setShortField(term55072, term55072.getClass(), "day", (short) 20);
        setField(term55071, term55071.getClass(), "date", term55072);
        setByteField(term55076, term55076.getClass(), "hour", (byte) 16);
        setByteField(term55076, term55076.getClass(), "minute", (byte) 13);
        setByteField(term55076, term55076.getClass(), "second", (byte) 15);
        setIntField(term55076, term55076.getClass(), "nano", 195741881);
        setField(term55071, term55071.getClass(), "time", term55076);
        setField(term55045, term55045.getClass(), "accessTime", term55071);
        setField(term55043, term55043.getClass(), "card", term55045);
        setIntField(term55043, term55043.getClass(), "lastDataVersion", -1081520792);
        setField(term55043, term55043.getClass(), "userName", "XnZHOhTfxL");
        setIntField(term55043, term55043.getClass(), "point", 1538397670);
        setIntField(term55043, term55043.getClass(), "totalPoint", 1892710246);
        setIntField(term55043, term55043.getClass(), "iconId", 1847407988);
        setIntField(term55043, term55043.getClass(), "nameplateId", 15668872);
        setIntField(term55043, term55043.getClass(), "frameId", -1367697974);
        setIntField(term55043, term55043.getClass(), "trophyId", 16297395);
        setIntField(term55043, term55043.getClass(), "playCount", 623171819);
        setIntField(term55043, term55043.getClass(), "playVsCount", 1066443567);
        setIntField(term55043, term55043.getClass(), "playSyncCount", 547908690);
        setIntField(term55043, term55043.getClass(), "winCount", -378543345);
        setIntField(term55043, term55043.getClass(), "helpCount", -2144696087);
        setIntField(term55043, term55043.getClass(), "comboCount", -1629969931);
        setIntField(term55043, term55043.getClass(), "feverCount", -1274836853);
        setIntField(term55043, term55043.getClass(), "totalHiScore", -757528574);
        setIntField(term55043, term55043.getClass(), "totalEasyHighScore", 673141075);
        setIntField(term55043, term55043.getClass(), "totalBasicHighScore", -1755544337);
        setIntField(term55043, term55043.getClass(), "totalAdvancedHighScore", -1445578997);
        setIntField(term55043, term55043.getClass(), "totalExpertHighScore", 830228887);
        setIntField(term55043, term55043.getClass(), "totalMasterHighScore", -903090832);
        setIntField(term55043, term55043.getClass(), "totalReMasterHighScore", -1760776056);
        setIntField(term55043, term55043.getClass(), "totalHighSync", 83069489);
        setIntField(term55043, term55043.getClass(), "totalEasySync", 2053017168);
        setIntField(term55043, term55043.getClass(), "totalBasicSync", -1780206644);
        setIntField(term55043, term55043.getClass(), "totalAdvancedSync", 507003800);
        setIntField(term55043, term55043.getClass(), "totalExpertSync", 344294065);
        setIntField(term55043, term55043.getClass(), "totalMasterSync", 1193234010);
        setIntField(term55043, term55043.getClass(), "totalReMasterSync", 988470366);
        setIntField(term55043, term55043.getClass(), "playerRating", -1015231314);
        setIntField(term55043, term55043.getClass(), "highestRating", 2138487887);
        setIntField(term55043, term55043.getClass(), "rankAuthTailId", 1608465153);
        setField(term55043, term55043.getClass(), "eventWatchedDate", "oFBhNamtAs");
        setField(term55043, term55043.getClass(), "webLimitDate", "YURcpRjwSt");
        setIntField(term55043, term55043.getClass(), "challengeTrackPhase", 1367934188);
        setIntField(term55043, term55043.getClass(), "firstPlayBits", -1586790224);
        setField(term55043, term55043.getClass(), "lastPlayDate", "SXMdNSGPog");
        setIntField(term55043, term55043.getClass(), "lastPlaceId", 188981994);
        setField(term55043, term55043.getClass(), "lastPlaceName", "vsqwOLpDjj");
        setIntField(term55043, term55043.getClass(), "lastRegionId", -1348114075);
        setField(term55043, term55043.getClass(), "lastRegionName", "rJgXQRsPCl");
        setField(term55043, term55043.getClass(), "lastClientId", "RgqpoBknjN");
        setField(term55043, term55043.getClass(), "lastCountryCode", "nUDhadopHE");
        setIntField(term55043, term55043.getClass(), "eventPoint", -1005643858);
        setIntField(term55043, term55043.getClass(), "totalLv", 456312486);
        setIntField(term55043, term55043.getClass(), "lastLoginBonusDay", 1799058363);
        setIntField(term55043, term55043.getClass(), "lastSurvivalBonusDay", 216003694);
        setIntField(term55043, term55043.getClass(), "loginBonusLv", -1542784975);
        setField(term55041, term55041.getClass(), "user", term55043);
        setIntField(term55041, term55041.getClass(), "soudEffect", 1798581458);
        setIntField(term55041, term55041.getClass(), "mirrorMode", -151417122);
        setIntField(term55041, term55041.getClass(), "guideSpeed", -2013771268);
        setIntField(term55041, term55041.getClass(), "bgInfo", 549034622);
        setIntField(term55041, term55041.getClass(), "brightness", 744233731);
        setIntField(term55041, term55041.getClass(), "isStarRot", 744742162);
        setIntField(term55041, term55041.getClass(), "breakSe", 482514787);
        setIntField(term55041, term55041.getClass(), "slideSe", -1042782085);
        setIntField(term55041, term55041.getClass(), "hardJudge", -1231956438);
        setIntField(term55041, term55041.getClass(), "isTagJump", 1392725436);
        setIntField(term55041, term55041.getClass(), "breakSeVol", 1678969110);
        setIntField(term55041, term55041.getClass(), "slideSeVol", -312665712);
        setIntField(term55041, term55041.getClass(), "isUpperDisp", 1022077229);
        setIntField(term55041, term55041.getClass(), "trackSkip", -1336430287);
        setIntField(term55041, term55041.getClass(), "optionMode", 1614467489);
        setIntField(term55041, term55041.getClass(), "simpleOptionParam", 1306583181);
        setIntField(term55041, term55041.getClass(), "adjustTiming", -1162066181);
        setIntField(term55041, term55041.getClass(), "dispTiming", 1058566964);
        setIntField(term55041, term55041.getClass(), "timingPos", 349842396);
        setIntField(term55041, term55041.getClass(), "ansVol", 1156977610);
        setIntField(term55041, term55041.getClass(), "noteVol", -800343585);
        setIntField(term55041, term55041.getClass(), "dmgVol", 1248328125);
        setIntField(term55041, term55041.getClass(), "appealFlame", 395562077);
        setIntField(term55041, term55041.getClass(), "isFeverDisp", -294800497);
        setIntField(term55041, term55041.getClass(), "dispJudge", 979334169);
        setIntField(term55041, term55041.getClass(), "judgePos", 840412156);
        setIntField(term55041, term55041.getClass(), "ratingGuard", 788624942);
        setIntField(term55041, term55041.getClass(), "selectChara", -1174113610);
        setIntField(term55041, term55041.getClass(), "sortType", -438676054);
        setIntField(term55041, term55041.getClass(), "filterGenre", -1032395364);
        setIntField(term55041, term55041.getClass(), "filterLevel", -552556865);
        setIntField(term55041, term55041.getClass(), "filterRank", -1908071026);
        setIntField(term55041, term55041.getClass(), "filterVersion", 737590127);
        setIntField(term55041, term55041.getClass(), "filterRec", 1091000908);
        setIntField(term55041, term55041.getClass(), "filterFullCombo", 417959197);
        setIntField(term55041, term55041.getClass(), "filterAllPerfect", 736672515);
        setIntField(term55041, term55041.getClass(), "filterDifficulty", 1093266289);
        setIntField(term55041, term55041.getClass(), "filterFullSync", -1407865478);
        setIntField(term55041, term55041.getClass(), "filterReMaster", 1207025764);
        setIntField(term55041, term55041.getClass(), "filterMaxFever", -220584965);
        setIntField(term55041, term55041.getClass(), "finalSelectId", -1579060613);
        setIntField(term55041, term55041.getClass(), "finalSelectCategory", -975355295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideSeVol", argTypes, term55041, args);
    }

};


