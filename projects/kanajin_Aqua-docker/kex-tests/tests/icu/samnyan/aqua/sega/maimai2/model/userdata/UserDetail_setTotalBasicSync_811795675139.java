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

public class UserDetail_setTotalBasicSync_811795675139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4308884;
     Object term4309255;

    public UserDetail_setTotalBasicSync_811795675139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4308888 = new Long(2812994364572081165L);
        Integer term4308951 = new Integer(-294164949);
        Integer term4308953 = new Integer(1240900440);
        Integer term4308955 = new Integer(1227926827);
        Integer term4308957 = new Integer(-1056033776);
        Integer term4308959 = new Integer(484119496);
        Integer term4308961 = new Integer(1357038884);
        Integer term4308963 = new Integer(990002371);
        ArrayList term4308949 = new ArrayList();
        ((ArrayList) term4308949).add(term4308951);
        ((ArrayList) term4308949).add(term4308953);
        ((ArrayList) term4308949).add(term4308955);
        ((ArrayList) term4308949).add(term4308957);
        ((ArrayList) term4308949).add(term4308959);
        ((ArrayList) term4308949).add(term4308961);
        ((ArrayList) term4308949).add(term4308963);
        Integer term4308969 = new Integer(-67320068);
        Integer term4308971 = new Integer(-1718166515);
        Integer term4308973 = new Integer(-1003939669);
        Integer term4308975 = new Integer(1632574348);
        Integer term4308977 = new Integer(-334489756);
        Integer term4308979 = new Integer(-1587831293);
        Integer term4308981 = new Integer(139569150);
        Integer term4308983 = new Integer(-1587632260);
        Integer term4308985 = new Integer(1221611988);
        ArrayList term4308967 = new ArrayList();
        ((ArrayList) term4308967).add(term4308969);
        ((ArrayList) term4308967).add(term4308971);
        ((ArrayList) term4308967).add(term4308973);
        ((ArrayList) term4308967).add(term4308975);
        ((ArrayList) term4308967).add(term4308977);
        ((ArrayList) term4308967).add(term4308979);
        ((ArrayList) term4308967).add(term4308981);
        ((ArrayList) term4308967).add(term4308983);
        ((ArrayList) term4308967).add(term4308985);
        term4308884 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4308886 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4308902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4308903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4308907 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4308912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4308913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4308917 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4308884, term4308884.getClass(), "id", -8282390428450312661L);
        setLongField(term4308886, term4308886.getClass(), "id", 6826726209157008596L);
        setField(term4308886, term4308886.getClass(), "extId", term4308888);
        setField(term4308886, term4308886.getClass(), "luid", "gfKGMJlYQX");
        setIntField(term4308903, term4308903.getClass(), "year", 2027);
        setShortField(term4308903, term4308903.getClass(), "month", (short) 7);
        setShortField(term4308903, term4308903.getClass(), "day", (short) 3);
        setField(term4308902, term4308902.getClass(), "date", term4308903);
        setByteField(term4308907, term4308907.getClass(), "hour", (byte) 2);
        setByteField(term4308907, term4308907.getClass(), "minute", (byte) 16);
        setByteField(term4308907, term4308907.getClass(), "second", (byte) 54);
        setIntField(term4308907, term4308907.getClass(), "nano", 604641398);
        setField(term4308902, term4308902.getClass(), "time", term4308907);
        setField(term4308886, term4308886.getClass(), "registerTime", term4308902);
        setIntField(term4308913, term4308913.getClass(), "year", 2026);
        setShortField(term4308913, term4308913.getClass(), "month", (short) 9);
        setShortField(term4308913, term4308913.getClass(), "day", (short) 3);
        setField(term4308912, term4308912.getClass(), "date", term4308913);
        setByteField(term4308917, term4308917.getClass(), "hour", (byte) 14);
        setByteField(term4308917, term4308917.getClass(), "minute", (byte) 53);
        setByteField(term4308917, term4308917.getClass(), "second", (byte) 55);
        setIntField(term4308917, term4308917.getClass(), "nano", 959084219);
        setField(term4308912, term4308912.getClass(), "time", term4308917);
        setField(term4308886, term4308886.getClass(), "accessTime", term4308912);
        setField(term4308884, term4308884.getClass(), "card", term4308886);
        setField(term4308884, term4308884.getClass(), "userName", "LenmuvHhtU");
        setIntField(term4308884, term4308884.getClass(), "isNetMember", 1154202349);
        setIntField(term4308884, term4308884.getClass(), "iconId", -1896201769);
        setIntField(term4308884, term4308884.getClass(), "plateId", 1223945558);
        setIntField(term4308884, term4308884.getClass(), "titleId", 888385238);
        setIntField(term4308884, term4308884.getClass(), "partnerId", 1532223123);
        setIntField(term4308884, term4308884.getClass(), "frameId", 505845899);
        setIntField(term4308884, term4308884.getClass(), "selectMapId", 523227100);
        setIntField(term4308884, term4308884.getClass(), "totalAwake", 1541737696);
        setIntField(term4308884, term4308884.getClass(), "gradeRating", 1206822769);
        setIntField(term4308884, term4308884.getClass(), "musicRating", -1314453468);
        setIntField(term4308884, term4308884.getClass(), "playerRating", 1515768172);
        setIntField(term4308884, term4308884.getClass(), "highestRating", 1606340403);
        setIntField(term4308884, term4308884.getClass(), "gradeRank", -1372380894);
        setIntField(term4308884, term4308884.getClass(), "classRank", -1543278395);
        setIntField(term4308884, term4308884.getClass(), "courseRank", 1022366550);
        setField(term4308884, term4308884.getClass(), "charaSlot", term4308949);
        setField(term4308884, term4308884.getClass(), "charaLockSlot", term4308967);
        setLongField(term4308884, term4308884.getClass(), "contentBit", -1719837438788165460L);
        setIntField(term4308884, term4308884.getClass(), "playCount", 735626979);
        setField(term4308884, term4308884.getClass(), "eventWatchedDate", "UgEUJqjJoY");
        setField(term4308884, term4308884.getClass(), "lastGameId", "xVcRjTdOmf");
        setField(term4308884, term4308884.getClass(), "lastRomVersion", "TfOMfRJXGb");
        setField(term4308884, term4308884.getClass(), "lastDataVersion", "pKwUdRubTV");
        setField(term4308884, term4308884.getClass(), "lastLoginDate", "BJPbcUnHAB");
        setField(term4308884, term4308884.getClass(), "lastPlayDate", "oCLOkiCWPk");
        setIntField(term4308884, term4308884.getClass(), "lastPlayCredit", 1708421510);
        setIntField(term4308884, term4308884.getClass(), "lastPlayMode", -512570153);
        setIntField(term4308884, term4308884.getClass(), "lastPlaceId", 706511118);
        setField(term4308884, term4308884.getClass(), "lastPlaceName", "sBVNUYtWGk");
        setIntField(term4308884, term4308884.getClass(), "lastAllNetId", 1704667927);
        setIntField(term4308884, term4308884.getClass(), "lastRegionId", 72305929);
        setField(term4308884, term4308884.getClass(), "lastRegionName", "sDHUQwwedW");
        setField(term4308884, term4308884.getClass(), "lastClientId", "OnrbsjWFYT");
        setField(term4308884, term4308884.getClass(), "lastCountryCode", "CCjHFhkwTm");
        setIntField(term4308884, term4308884.getClass(), "lastSelectEMoney", -2082813450);
        setIntField(term4308884, term4308884.getClass(), "lastSelectTicket", 1306122252);
        setIntField(term4308884, term4308884.getClass(), "lastSelectCourse", 1338891551);
        setIntField(term4308884, term4308884.getClass(), "lastCountCourse", -146543829);
        setField(term4308884, term4308884.getClass(), "firstGameId", "xunjDwlrTd");
        setField(term4308884, term4308884.getClass(), "firstRomVersion", "ssqjuJVnaT");
        setField(term4308884, term4308884.getClass(), "firstDataVersion", "qHiwUsVSVh");
        setField(term4308884, term4308884.getClass(), "firstPlayDate", "FafxahApip");
        setField(term4308884, term4308884.getClass(), "compatibleCmVersion", "HlmNQtKWcW");
        setField(term4308884, term4308884.getClass(), "dailyBonusDate", "SiDvMWnZGM");
        setField(term4308884, term4308884.getClass(), "dailyCourseBonusDate", "WaUBzJzBuQ");
        setField(term4308884, term4308884.getClass(), "lastPairLoginDate", "zxGMflBOCe");
        setField(term4308884, term4308884.getClass(), "lastTrialPlayDate", "PDBIvSwBwi");
        setIntField(term4308884, term4308884.getClass(), "playVsCount", -1099203285);
        setIntField(term4308884, term4308884.getClass(), "playSyncCount", 1894466035);
        setIntField(term4308884, term4308884.getClass(), "winCount", 1284463051);
        setIntField(term4308884, term4308884.getClass(), "helpCount", 148651835);
        setIntField(term4308884, term4308884.getClass(), "comboCount", 1629857376);
        setLongField(term4308884, term4308884.getClass(), "totalDeluxscore", 7514462478827216121L);
        setLongField(term4308884, term4308884.getClass(), "totalBasicDeluxscore", -4943402806498215357L);
        setLongField(term4308884, term4308884.getClass(), "totalAdvancedDeluxscore", -3338911053845076943L);
        setLongField(term4308884, term4308884.getClass(), "totalExpertDeluxscore", -6008306338171306983L);
        setLongField(term4308884, term4308884.getClass(), "totalMasterDeluxscore", 3848160321662616107L);
        setLongField(term4308884, term4308884.getClass(), "totalReMasterDeluxscore", -6082741358028436136L);
        setIntField(term4308884, term4308884.getClass(), "totalSync", 1585462517);
        setIntField(term4308884, term4308884.getClass(), "totalBasicSync", -1464275974);
        setIntField(term4308884, term4308884.getClass(), "totalAdvancedSync", -145327771);
        setIntField(term4308884, term4308884.getClass(), "totalExpertSync", 902641424);
        setIntField(term4308884, term4308884.getClass(), "totalMasterSync", -1500664203);
        setIntField(term4308884, term4308884.getClass(), "totalReMasterSync", -910494607);
        setLongField(term4308884, term4308884.getClass(), "totalAchievement", -104792393711986077L);
        setLongField(term4308884, term4308884.getClass(), "totalBasicAchievement", 4105504600217302217L);
        setLongField(term4308884, term4308884.getClass(), "totalAdvancedAchievement", 6736981580187197531L);
        setLongField(term4308884, term4308884.getClass(), "totalExpertAchievement", 8883934350604929213L);
        setLongField(term4308884, term4308884.getClass(), "totalMasterAchievement", 2135513539742557227L);
        setLongField(term4308884, term4308884.getClass(), "totalReMasterAchievement", -7480463219788711631L);
        setLongField(term4308884, term4308884.getClass(), "playerOldRating", -3638103937826921668L);
        setLongField(term4308884, term4308884.getClass(), "playerNewRating", 8814173548444358700L);
        setIntField(term4308884, term4308884.getClass(), "banState", -204991505);
        setLongField(term4308884, term4308884.getClass(), "dateTime", 813277270920274256L);
        term4309255 = new Integer(1781600317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4309255;
        callMethod(klass, "setTotalBasicSync", argTypes, term4308884, args);
    }

};


