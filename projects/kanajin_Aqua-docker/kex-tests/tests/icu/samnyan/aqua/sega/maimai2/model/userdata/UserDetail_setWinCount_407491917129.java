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

public class UserDetail_setWinCount_407491917129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269099;
     Object term269462;

    public UserDetail_setWinCount_407491917129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term269103 = new Long(3824691451696451167L);
        Integer term269166 = new Integer(-1160759211);
        Integer term269168 = new Integer(118302577);
        Integer term269170 = new Integer(-1192086944);
        Integer term269172 = new Integer(1689097670);
        Integer term269174 = new Integer(-229058840);
        Integer term269176 = new Integer(-445086770);
        Integer term269178 = new Integer(1555977804);
        Integer term269180 = new Integer(-1039875364);
        ArrayList term269164 = new ArrayList();
        ((ArrayList) term269164).add(term269166);
        ((ArrayList) term269164).add(term269168);
        ((ArrayList) term269164).add(term269170);
        ((ArrayList) term269164).add(term269172);
        ((ArrayList) term269164).add(term269174);
        ((ArrayList) term269164).add(term269176);
        ((ArrayList) term269164).add(term269178);
        ((ArrayList) term269164).add(term269180);
        Integer term269186 = new Integer(-908724029);
        Integer term269188 = new Integer(1122198417);
        Integer term269190 = new Integer(1853596233);
        Integer term269192 = new Integer(995880114);
        ArrayList term269184 = new ArrayList();
        ((ArrayList) term269184).add(term269186);
        ((ArrayList) term269184).add(term269188);
        ((ArrayList) term269184).add(term269190);
        ((ArrayList) term269184).add(term269192);
        term269099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term269101 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term269117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term269127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term269099, term269099.getClass(), "id", 1326058378264662866L);
        setLongField(term269101, term269101.getClass(), "id", 1813323343069269665L);
        setField(term269101, term269101.getClass(), "extId", term269103);
        setField(term269101, term269101.getClass(), "luid", "PwerdBbWmr");
        setIntField(term269118, term269118.getClass(), "year", 2025);
        setShortField(term269118, term269118.getClass(), "month", (short) 4);
        setShortField(term269118, term269118.getClass(), "day", (short) 11);
        setField(term269117, term269117.getClass(), "date", term269118);
        setByteField(term269122, term269122.getClass(), "hour", (byte) 5);
        setByteField(term269122, term269122.getClass(), "minute", (byte) 16);
        setByteField(term269122, term269122.getClass(), "second", (byte) 25);
        setIntField(term269122, term269122.getClass(), "nano", 178363433);
        setField(term269117, term269117.getClass(), "time", term269122);
        setField(term269101, term269101.getClass(), "registerTime", term269117);
        setIntField(term269128, term269128.getClass(), "year", 2025);
        setShortField(term269128, term269128.getClass(), "month", (short) 8);
        setShortField(term269128, term269128.getClass(), "day", (short) 12);
        setField(term269127, term269127.getClass(), "date", term269128);
        setByteField(term269132, term269132.getClass(), "hour", (byte) 13);
        setByteField(term269132, term269132.getClass(), "minute", (byte) 18);
        setByteField(term269132, term269132.getClass(), "second", (byte) 4);
        setIntField(term269132, term269132.getClass(), "nano", 550437598);
        setField(term269127, term269127.getClass(), "time", term269132);
        setField(term269101, term269101.getClass(), "accessTime", term269127);
        setField(term269099, term269099.getClass(), "card", term269101);
        setField(term269099, term269099.getClass(), "userName", "QoaNPXGspI");
        setIntField(term269099, term269099.getClass(), "isNetMember", -1493279078);
        setIntField(term269099, term269099.getClass(), "iconId", 639737443);
        setIntField(term269099, term269099.getClass(), "plateId", 916435001);
        setIntField(term269099, term269099.getClass(), "titleId", 589036561);
        setIntField(term269099, term269099.getClass(), "partnerId", 272900436);
        setIntField(term269099, term269099.getClass(), "frameId", -514490601);
        setIntField(term269099, term269099.getClass(), "selectMapId", -1010178423);
        setIntField(term269099, term269099.getClass(), "totalAwake", 938778978);
        setIntField(term269099, term269099.getClass(), "gradeRating", -1314147994);
        setIntField(term269099, term269099.getClass(), "musicRating", -1120741921);
        setIntField(term269099, term269099.getClass(), "playerRating", 1584813896);
        setIntField(term269099, term269099.getClass(), "highestRating", 678376088);
        setIntField(term269099, term269099.getClass(), "gradeRank", -1372919168);
        setIntField(term269099, term269099.getClass(), "classRank", -1947772440);
        setIntField(term269099, term269099.getClass(), "courseRank", -1418556051);
        setField(term269099, term269099.getClass(), "charaSlot", term269164);
        setField(term269099, term269099.getClass(), "charaLockSlot", term269184);
        setLongField(term269099, term269099.getClass(), "contentBit", -5620942992068411045L);
        setIntField(term269099, term269099.getClass(), "playCount", -336128698);
        setField(term269099, term269099.getClass(), "eventWatchedDate", "HGsYknyqnw");
        setField(term269099, term269099.getClass(), "lastGameId", "nSSaTIcgNB");
        setField(term269099, term269099.getClass(), "lastRomVersion", "XjDbTjwIhO");
        setField(term269099, term269099.getClass(), "lastDataVersion", "zcTaqvZYPD");
        setField(term269099, term269099.getClass(), "lastLoginDate", "VcPYeZWbaV");
        setField(term269099, term269099.getClass(), "lastPlayDate", "vZXmZnJkmA");
        setIntField(term269099, term269099.getClass(), "lastPlayCredit", 125498217);
        setIntField(term269099, term269099.getClass(), "lastPlayMode", 1952902014);
        setIntField(term269099, term269099.getClass(), "lastPlaceId", -1288918594);
        setField(term269099, term269099.getClass(), "lastPlaceName", "DLsTUONaVG");
        setIntField(term269099, term269099.getClass(), "lastAllNetId", 1636943183);
        setIntField(term269099, term269099.getClass(), "lastRegionId", 342127359);
        setField(term269099, term269099.getClass(), "lastRegionName", "CMxBJvoWmb");
        setField(term269099, term269099.getClass(), "lastClientId", "gxdAZEpSgS");
        setField(term269099, term269099.getClass(), "lastCountryCode", "JKJdAtnrrF");
        setIntField(term269099, term269099.getClass(), "lastSelectEMoney", 539999937);
        setIntField(term269099, term269099.getClass(), "lastSelectTicket", 310856051);
        setIntField(term269099, term269099.getClass(), "lastSelectCourse", 1384079547);
        setIntField(term269099, term269099.getClass(), "lastCountCourse", -1674866308);
        setField(term269099, term269099.getClass(), "firstGameId", "GpoyHXGieZ");
        setField(term269099, term269099.getClass(), "firstRomVersion", "cEFsvMVCTU");
        setField(term269099, term269099.getClass(), "firstDataVersion", "AqNriHImMY");
        setField(term269099, term269099.getClass(), "firstPlayDate", "mwSajMxzKy");
        setField(term269099, term269099.getClass(), "compatibleCmVersion", "mmzfmREmvG");
        setField(term269099, term269099.getClass(), "dailyBonusDate", "QDgqKUuIMf");
        setField(term269099, term269099.getClass(), "dailyCourseBonusDate", "KSrOHHauRF");
        setField(term269099, term269099.getClass(), "lastPairLoginDate", "crvtEHvIWK");
        setField(term269099, term269099.getClass(), "lastTrialPlayDate", "glDRFmYutu");
        setIntField(term269099, term269099.getClass(), "playVsCount", -1810236008);
        setIntField(term269099, term269099.getClass(), "playSyncCount", -1145916647);
        setIntField(term269099, term269099.getClass(), "winCount", -952656690);
        setIntField(term269099, term269099.getClass(), "helpCount", -1864087046);
        setIntField(term269099, term269099.getClass(), "comboCount", -450161434);
        setLongField(term269099, term269099.getClass(), "totalDeluxscore", 2275077944887622701L);
        setLongField(term269099, term269099.getClass(), "totalBasicDeluxscore", 366169856585292509L);
        setLongField(term269099, term269099.getClass(), "totalAdvancedDeluxscore", -7194096385812163162L);
        setLongField(term269099, term269099.getClass(), "totalExpertDeluxscore", -5703668087978241594L);
        setLongField(term269099, term269099.getClass(), "totalMasterDeluxscore", 572336995117588615L);
        setLongField(term269099, term269099.getClass(), "totalReMasterDeluxscore", -2911773388465607040L);
        setIntField(term269099, term269099.getClass(), "totalSync", 259091897);
        setIntField(term269099, term269099.getClass(), "totalBasicSync", -157779882);
        setIntField(term269099, term269099.getClass(), "totalAdvancedSync", 402378808);
        setIntField(term269099, term269099.getClass(), "totalExpertSync", 355737852);
        setIntField(term269099, term269099.getClass(), "totalMasterSync", -1259559367);
        setIntField(term269099, term269099.getClass(), "totalReMasterSync", 782057284);
        setLongField(term269099, term269099.getClass(), "totalAchievement", 8593789537428513006L);
        setLongField(term269099, term269099.getClass(), "totalBasicAchievement", -3251912231126297265L);
        setLongField(term269099, term269099.getClass(), "totalAdvancedAchievement", 7287058424451282850L);
        setLongField(term269099, term269099.getClass(), "totalExpertAchievement", 4386351002495729148L);
        setLongField(term269099, term269099.getClass(), "totalMasterAchievement", -2334700607136621482L);
        setLongField(term269099, term269099.getClass(), "totalReMasterAchievement", 8625716850409865655L);
        setLongField(term269099, term269099.getClass(), "playerOldRating", 663928308842821678L);
        setLongField(term269099, term269099.getClass(), "playerNewRating", -3106988846066392263L);
        setIntField(term269099, term269099.getClass(), "banState", -1312026978);
        setLongField(term269099, term269099.getClass(), "dateTime", -8853492436888099709L);
        term269462 = new Integer(327560526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269462;
        callMethod(klass, "setWinCount", argTypes, term269099, args);
    }

};


