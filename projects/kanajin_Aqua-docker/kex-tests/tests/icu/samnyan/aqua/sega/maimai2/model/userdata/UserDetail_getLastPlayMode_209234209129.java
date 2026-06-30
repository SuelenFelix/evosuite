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

public class UserDetail_getLastPlayMode_209234209129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4245953;

    public UserDetail_getLastPlayMode_209234209129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4245957 = new Long(5008463148838041695L);
        Integer term4246020 = new Integer(-724561959);
        Integer term4246022 = new Integer(473971426);
        Integer term4246024 = new Integer(-1017341002);
        Integer term4246026 = new Integer(-54592257);
        ArrayList term4246018 = new ArrayList();
        ((ArrayList) term4246018).add(term4246020);
        ((ArrayList) term4246018).add(term4246022);
        ((ArrayList) term4246018).add(term4246024);
        ((ArrayList) term4246018).add(term4246026);
        Integer term4246032 = new Integer(-949100313);
        Integer term4246034 = new Integer(-1081835094);
        Integer term4246036 = new Integer(1048568503);
        Integer term4246038 = new Integer(1162032291);
        Integer term4246040 = new Integer(2093059007);
        Integer term4246042 = new Integer(372882015);
        Integer term4246044 = new Integer(-1653385509);
        Integer term4246046 = new Integer(1135771983);
        Integer term4246048 = new Integer(190828856);
        ArrayList term4246030 = new ArrayList();
        ((ArrayList) term4246030).add(term4246032);
        ((ArrayList) term4246030).add(term4246034);
        ((ArrayList) term4246030).add(term4246036);
        ((ArrayList) term4246030).add(term4246038);
        ((ArrayList) term4246030).add(term4246040);
        ((ArrayList) term4246030).add(term4246042);
        ((ArrayList) term4246030).add(term4246044);
        ((ArrayList) term4246030).add(term4246046);
        ((ArrayList) term4246030).add(term4246048);
        term4245953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4245955 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4245971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4245972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4245976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4245981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4245982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4245986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4245953, term4245953.getClass(), "id", 1711428056562255421L);
        setLongField(term4245955, term4245955.getClass(), "id", -3051871570259204791L);
        setField(term4245955, term4245955.getClass(), "extId", term4245957);
        setField(term4245955, term4245955.getClass(), "luid", "LnsChfoUOV");
        setIntField(term4245972, term4245972.getClass(), "year", 2020);
        setShortField(term4245972, term4245972.getClass(), "month", (short) 3);
        setShortField(term4245972, term4245972.getClass(), "day", (short) 1);
        setField(term4245971, term4245971.getClass(), "date", term4245972);
        setByteField(term4245976, term4245976.getClass(), "hour", (byte) 9);
        setByteField(term4245976, term4245976.getClass(), "minute", (byte) 48);
        setByteField(term4245976, term4245976.getClass(), "second", (byte) 54);
        setIntField(term4245976, term4245976.getClass(), "nano", 784150840);
        setField(term4245971, term4245971.getClass(), "time", term4245976);
        setField(term4245955, term4245955.getClass(), "registerTime", term4245971);
        setIntField(term4245982, term4245982.getClass(), "year", 2011);
        setShortField(term4245982, term4245982.getClass(), "month", (short) 6);
        setShortField(term4245982, term4245982.getClass(), "day", (short) 20);
        setField(term4245981, term4245981.getClass(), "date", term4245982);
        setByteField(term4245986, term4245986.getClass(), "hour", (byte) 19);
        setByteField(term4245986, term4245986.getClass(), "minute", (byte) 5);
        setByteField(term4245986, term4245986.getClass(), "second", (byte) 50);
        setIntField(term4245986, term4245986.getClass(), "nano", 379328119);
        setField(term4245981, term4245981.getClass(), "time", term4245986);
        setField(term4245955, term4245955.getClass(), "accessTime", term4245981);
        setField(term4245953, term4245953.getClass(), "card", term4245955);
        setField(term4245953, term4245953.getClass(), "userName", "HHgNhwjiTc");
        setIntField(term4245953, term4245953.getClass(), "isNetMember", -681217994);
        setIntField(term4245953, term4245953.getClass(), "iconId", 2023939280);
        setIntField(term4245953, term4245953.getClass(), "plateId", 354395161);
        setIntField(term4245953, term4245953.getClass(), "titleId", 1497268698);
        setIntField(term4245953, term4245953.getClass(), "partnerId", 875591239);
        setIntField(term4245953, term4245953.getClass(), "frameId", 1768399976);
        setIntField(term4245953, term4245953.getClass(), "selectMapId", -1307782650);
        setIntField(term4245953, term4245953.getClass(), "totalAwake", -1123056809);
        setIntField(term4245953, term4245953.getClass(), "gradeRating", 913614044);
        setIntField(term4245953, term4245953.getClass(), "musicRating", -140874155);
        setIntField(term4245953, term4245953.getClass(), "playerRating", 1639562996);
        setIntField(term4245953, term4245953.getClass(), "highestRating", -1721213188);
        setIntField(term4245953, term4245953.getClass(), "gradeRank", -1977487591);
        setIntField(term4245953, term4245953.getClass(), "classRank", -1083008277);
        setIntField(term4245953, term4245953.getClass(), "courseRank", 346557816);
        setField(term4245953, term4245953.getClass(), "charaSlot", term4246018);
        setField(term4245953, term4245953.getClass(), "charaLockSlot", term4246030);
        setLongField(term4245953, term4245953.getClass(), "contentBit", 4659391072329184167L);
        setIntField(term4245953, term4245953.getClass(), "playCount", 927229083);
        setField(term4245953, term4245953.getClass(), "eventWatchedDate", "OECVgHZEEN");
        setField(term4245953, term4245953.getClass(), "lastGameId", "CldlgVSLqj");
        setField(term4245953, term4245953.getClass(), "lastRomVersion", "XcfjIyZVeU");
        setField(term4245953, term4245953.getClass(), "lastDataVersion", "UJdwKsSrpR");
        setField(term4245953, term4245953.getClass(), "lastLoginDate", "uXpjPwEwtQ");
        setField(term4245953, term4245953.getClass(), "lastPlayDate", "DvWNsgMhtE");
        setIntField(term4245953, term4245953.getClass(), "lastPlayCredit", -1864282672);
        setIntField(term4245953, term4245953.getClass(), "lastPlayMode", -1321231165);
        setIntField(term4245953, term4245953.getClass(), "lastPlaceId", 1886222517);
        setField(term4245953, term4245953.getClass(), "lastPlaceName", "ISgIpsKJmi");
        setIntField(term4245953, term4245953.getClass(), "lastAllNetId", 617417860);
        setIntField(term4245953, term4245953.getClass(), "lastRegionId", -1454938862);
        setField(term4245953, term4245953.getClass(), "lastRegionName", "kaKxDYRxAI");
        setField(term4245953, term4245953.getClass(), "lastClientId", "vvPsVYWmsb");
        setField(term4245953, term4245953.getClass(), "lastCountryCode", "hQQWWNuHbq");
        setIntField(term4245953, term4245953.getClass(), "lastSelectEMoney", -550735683);
        setIntField(term4245953, term4245953.getClass(), "lastSelectTicket", 628196881);
        setIntField(term4245953, term4245953.getClass(), "lastSelectCourse", 246831403);
        setIntField(term4245953, term4245953.getClass(), "lastCountCourse", -166498551);
        setField(term4245953, term4245953.getClass(), "firstGameId", "CWDufEGJEC");
        setField(term4245953, term4245953.getClass(), "firstRomVersion", "IHUMSBaxGN");
        setField(term4245953, term4245953.getClass(), "firstDataVersion", "oHdWmhWQMm");
        setField(term4245953, term4245953.getClass(), "firstPlayDate", "xBsOFChDbV");
        setField(term4245953, term4245953.getClass(), "compatibleCmVersion", "uYxXTKwDkw");
        setField(term4245953, term4245953.getClass(), "dailyBonusDate", "zObiROaYJp");
        setField(term4245953, term4245953.getClass(), "dailyCourseBonusDate", "qEYLCemBmD");
        setField(term4245953, term4245953.getClass(), "lastPairLoginDate", "fiFsXztJxm");
        setField(term4245953, term4245953.getClass(), "lastTrialPlayDate", "fqqXlgAgxN");
        setIntField(term4245953, term4245953.getClass(), "playVsCount", 762581576);
        setIntField(term4245953, term4245953.getClass(), "playSyncCount", 1013456427);
        setIntField(term4245953, term4245953.getClass(), "winCount", 2077044488);
        setIntField(term4245953, term4245953.getClass(), "helpCount", -621707259);
        setIntField(term4245953, term4245953.getClass(), "comboCount", 347238368);
        setLongField(term4245953, term4245953.getClass(), "totalDeluxscore", 9098903440948998477L);
        setLongField(term4245953, term4245953.getClass(), "totalBasicDeluxscore", -6898332967754143864L);
        setLongField(term4245953, term4245953.getClass(), "totalAdvancedDeluxscore", 7464912809053018750L);
        setLongField(term4245953, term4245953.getClass(), "totalExpertDeluxscore", 4707724297324799895L);
        setLongField(term4245953, term4245953.getClass(), "totalMasterDeluxscore", -3540822778828330627L);
        setLongField(term4245953, term4245953.getClass(), "totalReMasterDeluxscore", 4436134068798393993L);
        setIntField(term4245953, term4245953.getClass(), "totalSync", 1881686284);
        setIntField(term4245953, term4245953.getClass(), "totalBasicSync", 725141182);
        setIntField(term4245953, term4245953.getClass(), "totalAdvancedSync", 1544845268);
        setIntField(term4245953, term4245953.getClass(), "totalExpertSync", -156130344);
        setIntField(term4245953, term4245953.getClass(), "totalMasterSync", -155367012);
        setIntField(term4245953, term4245953.getClass(), "totalReMasterSync", -94462593);
        setLongField(term4245953, term4245953.getClass(), "totalAchievement", 3625716223347973345L);
        setLongField(term4245953, term4245953.getClass(), "totalBasicAchievement", 6505760408192579474L);
        setLongField(term4245953, term4245953.getClass(), "totalAdvancedAchievement", 3772435804451875422L);
        setLongField(term4245953, term4245953.getClass(), "totalExpertAchievement", -4066915330954486230L);
        setLongField(term4245953, term4245953.getClass(), "totalMasterAchievement", -3781971472623112668L);
        setLongField(term4245953, term4245953.getClass(), "totalReMasterAchievement", -679927892052675052L);
        setLongField(term4245953, term4245953.getClass(), "playerOldRating", 2450965686997527684L);
        setLongField(term4245953, term4245953.getClass(), "playerNewRating", -7455183025757421669L);
        setIntField(term4245953, term4245953.getClass(), "banState", 510473301);
        setLongField(term4245953, term4245953.getClass(), "dateTime", -4039407451011741223L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMode", argTypes, term4245953, args);
    }

};


