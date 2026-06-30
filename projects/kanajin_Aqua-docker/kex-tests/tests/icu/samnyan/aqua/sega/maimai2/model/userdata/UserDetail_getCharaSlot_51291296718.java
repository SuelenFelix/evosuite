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

public class UserDetail_getCharaSlot_51291296718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4239702;

    public UserDetail_getCharaSlot_51291296718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4239706 = new Long(-5963342408779721243L);
        Integer term4239769 = new Integer(1605118681);
        Integer term4239771 = new Integer(1912715011);
        Integer term4239773 = new Integer(-1793275062);
        Integer term4239775 = new Integer(311045652);
        Integer term4239777 = new Integer(-404238276);
        Integer term4239779 = new Integer(453390849);
        Integer term4239781 = new Integer(792369197);
        Integer term4239783 = new Integer(550257073);
        Integer term4239785 = new Integer(72941694);
        ArrayList term4239767 = new ArrayList();
        ((ArrayList) term4239767).add(term4239769);
        ((ArrayList) term4239767).add(term4239771);
        ((ArrayList) term4239767).add(term4239773);
        ((ArrayList) term4239767).add(term4239775);
        ((ArrayList) term4239767).add(term4239777);
        ((ArrayList) term4239767).add(term4239779);
        ((ArrayList) term4239767).add(term4239781);
        ((ArrayList) term4239767).add(term4239783);
        ((ArrayList) term4239767).add(term4239785);
        ArrayList term4239789 = new ArrayList();
        term4239702 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4239704 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4239720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4239721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4239725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4239730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4239731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4239735 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4239702, term4239702.getClass(), "id", -5732619045621194785L);
        setLongField(term4239704, term4239704.getClass(), "id", -1513024650332784347L);
        setField(term4239704, term4239704.getClass(), "extId", term4239706);
        setField(term4239704, term4239704.getClass(), "luid", "LxBVcAzfsG");
        setIntField(term4239721, term4239721.getClass(), "year", 2027);
        setShortField(term4239721, term4239721.getClass(), "month", (short) 1);
        setShortField(term4239721, term4239721.getClass(), "day", (short) 7);
        setField(term4239720, term4239720.getClass(), "date", term4239721);
        setByteField(term4239725, term4239725.getClass(), "hour", (byte) 8);
        setByteField(term4239725, term4239725.getClass(), "minute", (byte) 49);
        setByteField(term4239725, term4239725.getClass(), "second", (byte) 7);
        setIntField(term4239725, term4239725.getClass(), "nano", 504263344);
        setField(term4239720, term4239720.getClass(), "time", term4239725);
        setField(term4239704, term4239704.getClass(), "registerTime", term4239720);
        setIntField(term4239731, term4239731.getClass(), "year", 2010);
        setShortField(term4239731, term4239731.getClass(), "month", (short) 8);
        setShortField(term4239731, term4239731.getClass(), "day", (short) 30);
        setField(term4239730, term4239730.getClass(), "date", term4239731);
        setByteField(term4239735, term4239735.getClass(), "hour", (byte) 13);
        setByteField(term4239735, term4239735.getClass(), "minute", (byte) 0);
        setByteField(term4239735, term4239735.getClass(), "second", (byte) 12);
        setIntField(term4239735, term4239735.getClass(), "nano", 841841472);
        setField(term4239730, term4239730.getClass(), "time", term4239735);
        setField(term4239704, term4239704.getClass(), "accessTime", term4239730);
        setField(term4239702, term4239702.getClass(), "card", term4239704);
        setField(term4239702, term4239702.getClass(), "userName", "bxRnbBHFBi");
        setIntField(term4239702, term4239702.getClass(), "isNetMember", -1518156168);
        setIntField(term4239702, term4239702.getClass(), "iconId", -228144385);
        setIntField(term4239702, term4239702.getClass(), "plateId", -1149753437);
        setIntField(term4239702, term4239702.getClass(), "titleId", -1850524861);
        setIntField(term4239702, term4239702.getClass(), "partnerId", 2015910267);
        setIntField(term4239702, term4239702.getClass(), "frameId", 1014235065);
        setIntField(term4239702, term4239702.getClass(), "selectMapId", -1443646756);
        setIntField(term4239702, term4239702.getClass(), "totalAwake", 395863538);
        setIntField(term4239702, term4239702.getClass(), "gradeRating", -594187333);
        setIntField(term4239702, term4239702.getClass(), "musicRating", 968821108);
        setIntField(term4239702, term4239702.getClass(), "playerRating", 904620602);
        setIntField(term4239702, term4239702.getClass(), "highestRating", -1695765144);
        setIntField(term4239702, term4239702.getClass(), "gradeRank", -1073192337);
        setIntField(term4239702, term4239702.getClass(), "classRank", 351804981);
        setIntField(term4239702, term4239702.getClass(), "courseRank", 1096578934);
        setField(term4239702, term4239702.getClass(), "charaSlot", term4239767);
        setField(term4239702, term4239702.getClass(), "charaLockSlot", term4239789);
        setLongField(term4239702, term4239702.getClass(), "contentBit", -3569814291748776528L);
        setIntField(term4239702, term4239702.getClass(), "playCount", -1872369509);
        setField(term4239702, term4239702.getClass(), "eventWatchedDate", "RgiRVigzbz");
        setField(term4239702, term4239702.getClass(), "lastGameId", "nCaTWUVZyL");
        setField(term4239702, term4239702.getClass(), "lastRomVersion", "mYNjyqtCdk");
        setField(term4239702, term4239702.getClass(), "lastDataVersion", "WBDweJcGEp");
        setField(term4239702, term4239702.getClass(), "lastLoginDate", "ZaVghwwDXq");
        setField(term4239702, term4239702.getClass(), "lastPlayDate", "FANfNWmtUE");
        setIntField(term4239702, term4239702.getClass(), "lastPlayCredit", -1350168389);
        setIntField(term4239702, term4239702.getClass(), "lastPlayMode", -1134984426);
        setIntField(term4239702, term4239702.getClass(), "lastPlaceId", 1284134062);
        setField(term4239702, term4239702.getClass(), "lastPlaceName", "pAfGerRMTk");
        setIntField(term4239702, term4239702.getClass(), "lastAllNetId", 111740810);
        setIntField(term4239702, term4239702.getClass(), "lastRegionId", -312065486);
        setField(term4239702, term4239702.getClass(), "lastRegionName", "ZeUgbRvlgD");
        setField(term4239702, term4239702.getClass(), "lastClientId", "jjQGsqgnhy");
        setField(term4239702, term4239702.getClass(), "lastCountryCode", "ElimLSxrJu");
        setIntField(term4239702, term4239702.getClass(), "lastSelectEMoney", 2090933889);
        setIntField(term4239702, term4239702.getClass(), "lastSelectTicket", -1953708917);
        setIntField(term4239702, term4239702.getClass(), "lastSelectCourse", 1507660433);
        setIntField(term4239702, term4239702.getClass(), "lastCountCourse", 834660764);
        setField(term4239702, term4239702.getClass(), "firstGameId", "nlrnfcziEJ");
        setField(term4239702, term4239702.getClass(), "firstRomVersion", "CXdTXZDGlV");
        setField(term4239702, term4239702.getClass(), "firstDataVersion", "KrugMRIMgZ");
        setField(term4239702, term4239702.getClass(), "firstPlayDate", "sbeIBAQLmk");
        setField(term4239702, term4239702.getClass(), "compatibleCmVersion", "dwaMOYLNLt");
        setField(term4239702, term4239702.getClass(), "dailyBonusDate", "BwflIZMmXJ");
        setField(term4239702, term4239702.getClass(), "dailyCourseBonusDate", "GFFbcNUcmJ");
        setField(term4239702, term4239702.getClass(), "lastPairLoginDate", "FVpTjyIMmu");
        setField(term4239702, term4239702.getClass(), "lastTrialPlayDate", "HRwaTTAACP");
        setIntField(term4239702, term4239702.getClass(), "playVsCount", 903117211);
        setIntField(term4239702, term4239702.getClass(), "playSyncCount", 1711450278);
        setIntField(term4239702, term4239702.getClass(), "winCount", -1684124931);
        setIntField(term4239702, term4239702.getClass(), "helpCount", -1130170376);
        setIntField(term4239702, term4239702.getClass(), "comboCount", -994122499);
        setLongField(term4239702, term4239702.getClass(), "totalDeluxscore", -5901193513616052305L);
        setLongField(term4239702, term4239702.getClass(), "totalBasicDeluxscore", 1406760489638194211L);
        setLongField(term4239702, term4239702.getClass(), "totalAdvancedDeluxscore", 5549584871130838772L);
        setLongField(term4239702, term4239702.getClass(), "totalExpertDeluxscore", -8620696880637260996L);
        setLongField(term4239702, term4239702.getClass(), "totalMasterDeluxscore", -4758383515036378892L);
        setLongField(term4239702, term4239702.getClass(), "totalReMasterDeluxscore", 5077348048189800814L);
        setIntField(term4239702, term4239702.getClass(), "totalSync", -1531880921);
        setIntField(term4239702, term4239702.getClass(), "totalBasicSync", 413810915);
        setIntField(term4239702, term4239702.getClass(), "totalAdvancedSync", -748019772);
        setIntField(term4239702, term4239702.getClass(), "totalExpertSync", -824134487);
        setIntField(term4239702, term4239702.getClass(), "totalMasterSync", 321808559);
        setIntField(term4239702, term4239702.getClass(), "totalReMasterSync", 1641476653);
        setLongField(term4239702, term4239702.getClass(), "totalAchievement", 9191732091840103992L);
        setLongField(term4239702, term4239702.getClass(), "totalBasicAchievement", -3057852004376653216L);
        setLongField(term4239702, term4239702.getClass(), "totalAdvancedAchievement", -1952069353021109194L);
        setLongField(term4239702, term4239702.getClass(), "totalExpertAchievement", -8054910580658819597L);
        setLongField(term4239702, term4239702.getClass(), "totalMasterAchievement", -538615273431167495L);
        setLongField(term4239702, term4239702.getClass(), "totalReMasterAchievement", 4399179772563051396L);
        setLongField(term4239702, term4239702.getClass(), "playerOldRating", 8009706925417587457L);
        setLongField(term4239702, term4239702.getClass(), "playerNewRating", -1386229423737068178L);
        setIntField(term4239702, term4239702.getClass(), "banState", -1773205381);
        setLongField(term4239702, term4239702.getClass(), "dateTime", 2996517173853192295L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaSlot", argTypes, term4239702, args);
    }

};


