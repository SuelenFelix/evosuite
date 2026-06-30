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

public class UserDetail_setCompatibleCmVersion_1076667535122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4299133;

    public UserDetail_setCompatibleCmVersion_1076667535122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4299137 = new Long(-8750773609970352127L);
        Integer term4299200 = new Integer(-1584130001);
        ArrayList term4299198 = new ArrayList();
        ((ArrayList) term4299198).add(term4299200);
        Integer term4299206 = new Integer(-1669995376);
        Integer term4299208 = new Integer(-684090418);
        Integer term4299210 = new Integer(248781931);
        ArrayList term4299204 = new ArrayList();
        ((ArrayList) term4299204).add(term4299206);
        ((ArrayList) term4299204).add(term4299208);
        ((ArrayList) term4299204).add(term4299210);
        term4299133 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4299135 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4299151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4299152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4299156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4299161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4299162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4299166 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4299133, term4299133.getClass(), "id", -3485094196602402744L);
        setLongField(term4299135, term4299135.getClass(), "id", -3329996055671702047L);
        setField(term4299135, term4299135.getClass(), "extId", term4299137);
        setField(term4299135, term4299135.getClass(), "luid", "xDTcRJNZOT");
        setIntField(term4299152, term4299152.getClass(), "year", 2013);
        setShortField(term4299152, term4299152.getClass(), "month", (short) 3);
        setShortField(term4299152, term4299152.getClass(), "day", (short) 28);
        setField(term4299151, term4299151.getClass(), "date", term4299152);
        setByteField(term4299156, term4299156.getClass(), "hour", (byte) 16);
        setByteField(term4299156, term4299156.getClass(), "minute", (byte) 52);
        setByteField(term4299156, term4299156.getClass(), "second", (byte) 23);
        setIntField(term4299156, term4299156.getClass(), "nano", 703858706);
        setField(term4299151, term4299151.getClass(), "time", term4299156);
        setField(term4299135, term4299135.getClass(), "registerTime", term4299151);
        setIntField(term4299162, term4299162.getClass(), "year", 2021);
        setShortField(term4299162, term4299162.getClass(), "month", (short) 2);
        setShortField(term4299162, term4299162.getClass(), "day", (short) 14);
        setField(term4299161, term4299161.getClass(), "date", term4299162);
        setByteField(term4299166, term4299166.getClass(), "hour", (byte) 2);
        setByteField(term4299166, term4299166.getClass(), "minute", (byte) 52);
        setByteField(term4299166, term4299166.getClass(), "second", (byte) 58);
        setIntField(term4299166, term4299166.getClass(), "nano", 537525752);
        setField(term4299161, term4299161.getClass(), "time", term4299166);
        setField(term4299135, term4299135.getClass(), "accessTime", term4299161);
        setField(term4299133, term4299133.getClass(), "card", term4299135);
        setField(term4299133, term4299133.getClass(), "userName", "HEXEftGuGF");
        setIntField(term4299133, term4299133.getClass(), "isNetMember", -1012388978);
        setIntField(term4299133, term4299133.getClass(), "iconId", 918574921);
        setIntField(term4299133, term4299133.getClass(), "plateId", 2103428927);
        setIntField(term4299133, term4299133.getClass(), "titleId", -1932686783);
        setIntField(term4299133, term4299133.getClass(), "partnerId", -1502280797);
        setIntField(term4299133, term4299133.getClass(), "frameId", -304383165);
        setIntField(term4299133, term4299133.getClass(), "selectMapId", -473283606);
        setIntField(term4299133, term4299133.getClass(), "totalAwake", -322006784);
        setIntField(term4299133, term4299133.getClass(), "gradeRating", 245515477);
        setIntField(term4299133, term4299133.getClass(), "musicRating", 1785998566);
        setIntField(term4299133, term4299133.getClass(), "playerRating", -931680015);
        setIntField(term4299133, term4299133.getClass(), "highestRating", 98671163);
        setIntField(term4299133, term4299133.getClass(), "gradeRank", 1243555650);
        setIntField(term4299133, term4299133.getClass(), "classRank", -1472801029);
        setIntField(term4299133, term4299133.getClass(), "courseRank", -1664432653);
        setField(term4299133, term4299133.getClass(), "charaSlot", term4299198);
        setField(term4299133, term4299133.getClass(), "charaLockSlot", term4299204);
        setLongField(term4299133, term4299133.getClass(), "contentBit", -123454609602100953L);
        setIntField(term4299133, term4299133.getClass(), "playCount", -717759112);
        setField(term4299133, term4299133.getClass(), "eventWatchedDate", "IsKarhXTWo");
        setField(term4299133, term4299133.getClass(), "lastGameId", "XstTAOUpff");
        setField(term4299133, term4299133.getClass(), "lastRomVersion", "jyiMkVZwNO");
        setField(term4299133, term4299133.getClass(), "lastDataVersion", "SGkTlMZNga");
        setField(term4299133, term4299133.getClass(), "lastLoginDate", "nIYGXbwaiX");
        setField(term4299133, term4299133.getClass(), "lastPlayDate", "vpOQqDFBLD");
        setIntField(term4299133, term4299133.getClass(), "lastPlayCredit", 1922349505);
        setIntField(term4299133, term4299133.getClass(), "lastPlayMode", 1917318100);
        setIntField(term4299133, term4299133.getClass(), "lastPlaceId", 24802362);
        setField(term4299133, term4299133.getClass(), "lastPlaceName", "TgYXFiLSfC");
        setIntField(term4299133, term4299133.getClass(), "lastAllNetId", 1479814859);
        setIntField(term4299133, term4299133.getClass(), "lastRegionId", -168800751);
        setField(term4299133, term4299133.getClass(), "lastRegionName", "oHWpDDONhp");
        setField(term4299133, term4299133.getClass(), "lastClientId", "YXBlkkGmMI");
        setField(term4299133, term4299133.getClass(), "lastCountryCode", "bmUbcshcWW");
        setIntField(term4299133, term4299133.getClass(), "lastSelectEMoney", -1151674517);
        setIntField(term4299133, term4299133.getClass(), "lastSelectTicket", 1393709067);
        setIntField(term4299133, term4299133.getClass(), "lastSelectCourse", -1356247136);
        setIntField(term4299133, term4299133.getClass(), "lastCountCourse", -894700460);
        setField(term4299133, term4299133.getClass(), "firstGameId", "RmiRELvNLJ");
        setField(term4299133, term4299133.getClass(), "firstRomVersion", "dCztthYuDc");
        setField(term4299133, term4299133.getClass(), "firstDataVersion", "vOfFVECWzO");
        setField(term4299133, term4299133.getClass(), "firstPlayDate", "MSYDvFGyAF");
        setField(term4299133, term4299133.getClass(), "compatibleCmVersion", "llZNFYXTnO");
        setField(term4299133, term4299133.getClass(), "dailyBonusDate", "NKHPqEdthc");
        setField(term4299133, term4299133.getClass(), "dailyCourseBonusDate", "OEHcDAbyaN");
        setField(term4299133, term4299133.getClass(), "lastPairLoginDate", "yUBXkMDqkx");
        setField(term4299133, term4299133.getClass(), "lastTrialPlayDate", "MhPAUWkHZZ");
        setIntField(term4299133, term4299133.getClass(), "playVsCount", 1718122443);
        setIntField(term4299133, term4299133.getClass(), "playSyncCount", -872432833);
        setIntField(term4299133, term4299133.getClass(), "winCount", 161875896);
        setIntField(term4299133, term4299133.getClass(), "helpCount", -228673091);
        setIntField(term4299133, term4299133.getClass(), "comboCount", 1549785006);
        setLongField(term4299133, term4299133.getClass(), "totalDeluxscore", -3371120214387577053L);
        setLongField(term4299133, term4299133.getClass(), "totalBasicDeluxscore", -8560352328439647994L);
        setLongField(term4299133, term4299133.getClass(), "totalAdvancedDeluxscore", 3368321195283894965L);
        setLongField(term4299133, term4299133.getClass(), "totalExpertDeluxscore", 5286234683326644794L);
        setLongField(term4299133, term4299133.getClass(), "totalMasterDeluxscore", 7225054436776002586L);
        setLongField(term4299133, term4299133.getClass(), "totalReMasterDeluxscore", 7763787524128411299L);
        setIntField(term4299133, term4299133.getClass(), "totalSync", -944855790);
        setIntField(term4299133, term4299133.getClass(), "totalBasicSync", -1115993487);
        setIntField(term4299133, term4299133.getClass(), "totalAdvancedSync", 528850568);
        setIntField(term4299133, term4299133.getClass(), "totalExpertSync", 77592423);
        setIntField(term4299133, term4299133.getClass(), "totalMasterSync", 1729229626);
        setIntField(term4299133, term4299133.getClass(), "totalReMasterSync", 430500937);
        setLongField(term4299133, term4299133.getClass(), "totalAchievement", -179387320837935445L);
        setLongField(term4299133, term4299133.getClass(), "totalBasicAchievement", -4432556481169743274L);
        setLongField(term4299133, term4299133.getClass(), "totalAdvancedAchievement", -7394749669729760545L);
        setLongField(term4299133, term4299133.getClass(), "totalExpertAchievement", -3591731613502028676L);
        setLongField(term4299133, term4299133.getClass(), "totalMasterAchievement", 4685945844642343884L);
        setLongField(term4299133, term4299133.getClass(), "totalReMasterAchievement", -5159172337966585223L);
        setLongField(term4299133, term4299133.getClass(), "playerOldRating", -4921002987954396947L);
        setLongField(term4299133, term4299133.getClass(), "playerNewRating", 5535196205530003792L);
        setIntField(term4299133, term4299133.getClass(), "banState", -49187030);
        setLongField(term4299133, term4299133.getClass(), "dateTime", -1979346296115466203L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lrUSyrXyFJ";
        callMethod(klass, "setCompatibleCmVersion", argTypes, term4299133, args);
    }

};


