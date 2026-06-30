package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getPlaySyncCount_38522929451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4258399;

    public UserDetail_getPlaySyncCount_38522929451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4258403 = new Long(-8233584794966246633L);
        Integer term4258466 = new Integer(448122027);
        Integer term4258468 = new Integer(-1936645212);
        Integer term4258470 = new Integer(-770480497);
        ArrayList term4258464 = new ArrayList();
        ((ArrayList) term4258464).add(term4258466);
        ((ArrayList) term4258464).add(term4258468);
        ((ArrayList) term4258464).add(term4258470);
        Integer term4258476 = new Integer(379983129);
        Integer term4258478 = new Integer(-215542299);
        Integer term4258480 = new Integer(1063632099);
        ArrayList term4258474 = new ArrayList();
        ((ArrayList) term4258474).add(term4258476);
        ((ArrayList) term4258474).add(term4258478);
        ((ArrayList) term4258474).add(term4258480);
        term4258399 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4258401 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4258417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4258418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4258422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4258427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4258428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4258432 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4258399, term4258399.getClass(), "id", -8418412618460722218L);
        setLongField(term4258401, term4258401.getClass(), "id", 7843731582169006293L);
        setField(term4258401, term4258401.getClass(), "extId", term4258403);
        setField(term4258401, term4258401.getClass(), "luid", "YMnHXTTcfQ");
        setIntField(term4258418, term4258418.getClass(), "year", 2026);
        setShortField(term4258418, term4258418.getClass(), "month", (short) 10);
        setShortField(term4258418, term4258418.getClass(), "day", (short) 26);
        setField(term4258417, term4258417.getClass(), "date", term4258418);
        setByteField(term4258422, term4258422.getClass(), "hour", (byte) 3);
        setByteField(term4258422, term4258422.getClass(), "minute", (byte) 55);
        setByteField(term4258422, term4258422.getClass(), "second", (byte) 22);
        setIntField(term4258422, term4258422.getClass(), "nano", 147152763);
        setField(term4258417, term4258417.getClass(), "time", term4258422);
        setField(term4258401, term4258401.getClass(), "registerTime", term4258417);
        setIntField(term4258428, term4258428.getClass(), "year", 2019);
        setShortField(term4258428, term4258428.getClass(), "month", (short) 11);
        setShortField(term4258428, term4258428.getClass(), "day", (short) 13);
        setField(term4258427, term4258427.getClass(), "date", term4258428);
        setByteField(term4258432, term4258432.getClass(), "hour", (byte) 21);
        setByteField(term4258432, term4258432.getClass(), "minute", (byte) 10);
        setByteField(term4258432, term4258432.getClass(), "second", (byte) 22);
        setIntField(term4258432, term4258432.getClass(), "nano", 172445529);
        setField(term4258427, term4258427.getClass(), "time", term4258432);
        setField(term4258401, term4258401.getClass(), "accessTime", term4258427);
        setField(term4258399, term4258399.getClass(), "card", term4258401);
        setField(term4258399, term4258399.getClass(), "userName", "AOYjRjUOqB");
        setIntField(term4258399, term4258399.getClass(), "isNetMember", -1037314311);
        setIntField(term4258399, term4258399.getClass(), "iconId", 1451755287);
        setIntField(term4258399, term4258399.getClass(), "plateId", -1577740205);
        setIntField(term4258399, term4258399.getClass(), "titleId", 1599833806);
        setIntField(term4258399, term4258399.getClass(), "partnerId", 419439618);
        setIntField(term4258399, term4258399.getClass(), "frameId", -321534191);
        setIntField(term4258399, term4258399.getClass(), "selectMapId", -844757347);
        setIntField(term4258399, term4258399.getClass(), "totalAwake", 2088411285);
        setIntField(term4258399, term4258399.getClass(), "gradeRating", -69471884);
        setIntField(term4258399, term4258399.getClass(), "musicRating", 2069919458);
        setIntField(term4258399, term4258399.getClass(), "playerRating", -85298162);
        setIntField(term4258399, term4258399.getClass(), "highestRating", 1982484603);
        setIntField(term4258399, term4258399.getClass(), "gradeRank", 2022039272);
        setIntField(term4258399, term4258399.getClass(), "classRank", -53903501);
        setIntField(term4258399, term4258399.getClass(), "courseRank", -1023294079);
        setField(term4258399, term4258399.getClass(), "charaSlot", term4258464);
        setField(term4258399, term4258399.getClass(), "charaLockSlot", term4258474);
        setLongField(term4258399, term4258399.getClass(), "contentBit", 8470357928300408499L);
        setIntField(term4258399, term4258399.getClass(), "playCount", 1729973183);
        setField(term4258399, term4258399.getClass(), "eventWatchedDate", "sYsFfRJQzO");
        setField(term4258399, term4258399.getClass(), "lastGameId", "YrTpSkpCqR");
        setField(term4258399, term4258399.getClass(), "lastRomVersion", "VBNdsDAlAN");
        setField(term4258399, term4258399.getClass(), "lastDataVersion", "wyZEvUxfkd");
        setField(term4258399, term4258399.getClass(), "lastLoginDate", "YkDwVFJvSg");
        setField(term4258399, term4258399.getClass(), "lastPlayDate", "wsUxcffcdz");
        setIntField(term4258399, term4258399.getClass(), "lastPlayCredit", 988928256);
        setIntField(term4258399, term4258399.getClass(), "lastPlayMode", -2146225413);
        setIntField(term4258399, term4258399.getClass(), "lastPlaceId", 838461934);
        setField(term4258399, term4258399.getClass(), "lastPlaceName", "GzUoupRMxj");
        setIntField(term4258399, term4258399.getClass(), "lastAllNetId", 1069211028);
        setIntField(term4258399, term4258399.getClass(), "lastRegionId", 2019301086);
        setField(term4258399, term4258399.getClass(), "lastRegionName", "HmKPEGwzrs");
        setField(term4258399, term4258399.getClass(), "lastClientId", "QRRVLFwxtg");
        setField(term4258399, term4258399.getClass(), "lastCountryCode", "ivRaCRjPUs");
        setIntField(term4258399, term4258399.getClass(), "lastSelectEMoney", -1044058275);
        setIntField(term4258399, term4258399.getClass(), "lastSelectTicket", -567781634);
        setIntField(term4258399, term4258399.getClass(), "lastSelectCourse", 885582374);
        setIntField(term4258399, term4258399.getClass(), "lastCountCourse", 202504921);
        setField(term4258399, term4258399.getClass(), "firstGameId", "BPcodVDyGg");
        setField(term4258399, term4258399.getClass(), "firstRomVersion", "pDpgPFXIwc");
        setField(term4258399, term4258399.getClass(), "firstDataVersion", "WwzjLipGIK");
        setField(term4258399, term4258399.getClass(), "firstPlayDate", "UNCaVPNlKb");
        setField(term4258399, term4258399.getClass(), "compatibleCmVersion", "XwwUjXUjsH");
        setField(term4258399, term4258399.getClass(), "dailyBonusDate", "RDbMPzOWPv");
        setField(term4258399, term4258399.getClass(), "dailyCourseBonusDate", "hZwVjWIGjj");
        setField(term4258399, term4258399.getClass(), "lastPairLoginDate", "rSRCSSUhow");
        setField(term4258399, term4258399.getClass(), "lastTrialPlayDate", "phMAyEGNKL");
        setIntField(term4258399, term4258399.getClass(), "playVsCount", 625246927);
        setIntField(term4258399, term4258399.getClass(), "playSyncCount", 1658141408);
        setIntField(term4258399, term4258399.getClass(), "winCount", -1870357025);
        setIntField(term4258399, term4258399.getClass(), "helpCount", 924568174);
        setIntField(term4258399, term4258399.getClass(), "comboCount", -129059141);
        setLongField(term4258399, term4258399.getClass(), "totalDeluxscore", 5752004390409372169L);
        setLongField(term4258399, term4258399.getClass(), "totalBasicDeluxscore", -66313679210291014L);
        setLongField(term4258399, term4258399.getClass(), "totalAdvancedDeluxscore", -1439083035021103564L);
        setLongField(term4258399, term4258399.getClass(), "totalExpertDeluxscore", 6367274751419986166L);
        setLongField(term4258399, term4258399.getClass(), "totalMasterDeluxscore", -1809912769567082231L);
        setLongField(term4258399, term4258399.getClass(), "totalReMasterDeluxscore", -4453568481713499316L);
        setIntField(term4258399, term4258399.getClass(), "totalSync", 696743773);
        setIntField(term4258399, term4258399.getClass(), "totalBasicSync", 2046840037);
        setIntField(term4258399, term4258399.getClass(), "totalAdvancedSync", 1605726580);
        setIntField(term4258399, term4258399.getClass(), "totalExpertSync", -2068634391);
        setIntField(term4258399, term4258399.getClass(), "totalMasterSync", 1840036393);
        setIntField(term4258399, term4258399.getClass(), "totalReMasterSync", -821999897);
        setLongField(term4258399, term4258399.getClass(), "totalAchievement", -5835895789360022582L);
        setLongField(term4258399, term4258399.getClass(), "totalBasicAchievement", 109148483416879475L);
        setLongField(term4258399, term4258399.getClass(), "totalAdvancedAchievement", -5782781654936856598L);
        setLongField(term4258399, term4258399.getClass(), "totalExpertAchievement", -7267047326333401020L);
        setLongField(term4258399, term4258399.getClass(), "totalMasterAchievement", 2255836474142023667L);
        setLongField(term4258399, term4258399.getClass(), "totalReMasterAchievement", -2485373921879583437L);
        setLongField(term4258399, term4258399.getClass(), "playerOldRating", 8917139956193372841L);
        setLongField(term4258399, term4258399.getClass(), "playerNewRating", -1935105606048671715L);
        setIntField(term4258399, term4258399.getClass(), "banState", 1370735763);
        setLongField(term4258399, term4258399.getClass(), "dateTime", 7816762020330583151L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaySyncCount", argTypes, term4258399, args);
    }

};


