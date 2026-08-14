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

public class UserDetail_setContentBit_18051146897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250509;
     Object term250866;

    public UserDetail_setContentBit_18051146897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term250513 = new Long(-3565554762799701668L);
        Integer term250576 = new Integer(805890273);
        Integer term250578 = new Integer(1078863472);
        Integer term250580 = new Integer(-1845619952);
        ArrayList term250574 = new ArrayList();
        ((ArrayList) term250574).add(term250576);
        ((ArrayList) term250574).add(term250578);
        ((ArrayList) term250574).add(term250580);
        Integer term250586 = new Integer(-1363744441);
        Integer term250588 = new Integer(-1303828030);
        Integer term250590 = new Integer(1611629079);
        Integer term250592 = new Integer(770171276);
        Integer term250594 = new Integer(-1497914215);
        Integer term250596 = new Integer(254385018);
        ArrayList term250584 = new ArrayList();
        ((ArrayList) term250584).add(term250586);
        ((ArrayList) term250584).add(term250588);
        ((ArrayList) term250584).add(term250590);
        ((ArrayList) term250584).add(term250592);
        ((ArrayList) term250584).add(term250594);
        ((ArrayList) term250584).add(term250596);
        term250509 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term250511 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term250527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250532 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250542 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term250509, term250509.getClass(), "id", 2509858921984830081L);
        setLongField(term250511, term250511.getClass(), "id", 3336585092088783329L);
        setField(term250511, term250511.getClass(), "extId", term250513);
        setField(term250511, term250511.getClass(), "luid", "KxinsOQMeG");
        setIntField(term250528, term250528.getClass(), "year", 2024);
        setShortField(term250528, term250528.getClass(), "month", (short) 7);
        setShortField(term250528, term250528.getClass(), "day", (short) 15);
        setField(term250527, term250527.getClass(), "date", term250528);
        setByteField(term250532, term250532.getClass(), "hour", (byte) 14);
        setByteField(term250532, term250532.getClass(), "minute", (byte) 18);
        setByteField(term250532, term250532.getClass(), "second", (byte) 58);
        setIntField(term250532, term250532.getClass(), "nano", 537827095);
        setField(term250527, term250527.getClass(), "time", term250532);
        setField(term250511, term250511.getClass(), "registerTime", term250527);
        setIntField(term250538, term250538.getClass(), "year", 2025);
        setShortField(term250538, term250538.getClass(), "month", (short) 9);
        setShortField(term250538, term250538.getClass(), "day", (short) 18);
        setField(term250537, term250537.getClass(), "date", term250538);
        setByteField(term250542, term250542.getClass(), "hour", (byte) 9);
        setByteField(term250542, term250542.getClass(), "minute", (byte) 14);
        setByteField(term250542, term250542.getClass(), "second", (byte) 26);
        setIntField(term250542, term250542.getClass(), "nano", 567071659);
        setField(term250537, term250537.getClass(), "time", term250542);
        setField(term250511, term250511.getClass(), "accessTime", term250537);
        setField(term250509, term250509.getClass(), "card", term250511);
        setField(term250509, term250509.getClass(), "userName", "mbuEVrmMpD");
        setIntField(term250509, term250509.getClass(), "isNetMember", 1928083323);
        setIntField(term250509, term250509.getClass(), "iconId", -267430690);
        setIntField(term250509, term250509.getClass(), "plateId", 745712799);
        setIntField(term250509, term250509.getClass(), "titleId", 784378668);
        setIntField(term250509, term250509.getClass(), "partnerId", -1242913019);
        setIntField(term250509, term250509.getClass(), "frameId", 1086277183);
        setIntField(term250509, term250509.getClass(), "selectMapId", -546285718);
        setIntField(term250509, term250509.getClass(), "totalAwake", 233439438);
        setIntField(term250509, term250509.getClass(), "gradeRating", -17888307);
        setIntField(term250509, term250509.getClass(), "musicRating", 1613820074);
        setIntField(term250509, term250509.getClass(), "playerRating", 434316238);
        setIntField(term250509, term250509.getClass(), "highestRating", 1100995892);
        setIntField(term250509, term250509.getClass(), "gradeRank", 2043611175);
        setIntField(term250509, term250509.getClass(), "classRank", 645234038);
        setIntField(term250509, term250509.getClass(), "courseRank", -1080336027);
        setField(term250509, term250509.getClass(), "charaSlot", term250574);
        setField(term250509, term250509.getClass(), "charaLockSlot", term250584);
        setLongField(term250509, term250509.getClass(), "contentBit", -6063691827303829997L);
        setIntField(term250509, term250509.getClass(), "playCount", 707070705);
        setField(term250509, term250509.getClass(), "eventWatchedDate", "gQGlISxORX");
        setField(term250509, term250509.getClass(), "lastGameId", "IhgSPsiEAp");
        setField(term250509, term250509.getClass(), "lastRomVersion", "VIiDjdCWsX");
        setField(term250509, term250509.getClass(), "lastDataVersion", "HUpXsvCasn");
        setField(term250509, term250509.getClass(), "lastLoginDate", "gxKFHEvCMQ");
        setField(term250509, term250509.getClass(), "lastPlayDate", "WGrgiaSQnl");
        setIntField(term250509, term250509.getClass(), "lastPlayCredit", -1572025779);
        setIntField(term250509, term250509.getClass(), "lastPlayMode", -1700572838);
        setIntField(term250509, term250509.getClass(), "lastPlaceId", 2113787021);
        setField(term250509, term250509.getClass(), "lastPlaceName", "FdPORhHvkS");
        setIntField(term250509, term250509.getClass(), "lastAllNetId", -1284796207);
        setIntField(term250509, term250509.getClass(), "lastRegionId", -864683352);
        setField(term250509, term250509.getClass(), "lastRegionName", "HheeaUYjPr");
        setField(term250509, term250509.getClass(), "lastClientId", "nyKmTaUwFt");
        setField(term250509, term250509.getClass(), "lastCountryCode", "rzqaoonvCb");
        setIntField(term250509, term250509.getClass(), "lastSelectEMoney", -335374489);
        setIntField(term250509, term250509.getClass(), "lastSelectTicket", -1715333049);
        setIntField(term250509, term250509.getClass(), "lastSelectCourse", -246990874);
        setIntField(term250509, term250509.getClass(), "lastCountCourse", -49493427);
        setField(term250509, term250509.getClass(), "firstGameId", "DHAcIlnUmH");
        setField(term250509, term250509.getClass(), "firstRomVersion", "PXpuIQuvxu");
        setField(term250509, term250509.getClass(), "firstDataVersion", "RGuievXeWF");
        setField(term250509, term250509.getClass(), "firstPlayDate", "RNWAfuYVdn");
        setField(term250509, term250509.getClass(), "compatibleCmVersion", "hZuxPbhKHd");
        setField(term250509, term250509.getClass(), "dailyBonusDate", "owuVENinAF");
        setField(term250509, term250509.getClass(), "dailyCourseBonusDate", "wrEbOqtEzd");
        setField(term250509, term250509.getClass(), "lastPairLoginDate", "wnmgduZOMm");
        setField(term250509, term250509.getClass(), "lastTrialPlayDate", "CunxEcVQZW");
        setIntField(term250509, term250509.getClass(), "playVsCount", -746387656);
        setIntField(term250509, term250509.getClass(), "playSyncCount", 236632672);
        setIntField(term250509, term250509.getClass(), "winCount", -1778786592);
        setIntField(term250509, term250509.getClass(), "helpCount", 529851849);
        setIntField(term250509, term250509.getClass(), "comboCount", -32810393);
        setLongField(term250509, term250509.getClass(), "totalDeluxscore", 336643214054124311L);
        setLongField(term250509, term250509.getClass(), "totalBasicDeluxscore", -1226402360260801904L);
        setLongField(term250509, term250509.getClass(), "totalAdvancedDeluxscore", -3566667472714372629L);
        setLongField(term250509, term250509.getClass(), "totalExpertDeluxscore", -8274474188131459447L);
        setLongField(term250509, term250509.getClass(), "totalMasterDeluxscore", -7007598071998701823L);
        setLongField(term250509, term250509.getClass(), "totalReMasterDeluxscore", 2079354530625693937L);
        setIntField(term250509, term250509.getClass(), "totalSync", 318797269);
        setIntField(term250509, term250509.getClass(), "totalBasicSync", 1122053794);
        setIntField(term250509, term250509.getClass(), "totalAdvancedSync", 1089884193);
        setIntField(term250509, term250509.getClass(), "totalExpertSync", -1270471358);
        setIntField(term250509, term250509.getClass(), "totalMasterSync", 2014064499);
        setIntField(term250509, term250509.getClass(), "totalReMasterSync", 796034065);
        setLongField(term250509, term250509.getClass(), "totalAchievement", 8810222422010860794L);
        setLongField(term250509, term250509.getClass(), "totalBasicAchievement", -61756079163308321L);
        setLongField(term250509, term250509.getClass(), "totalAdvancedAchievement", 5262523692712566229L);
        setLongField(term250509, term250509.getClass(), "totalExpertAchievement", -2784334583718983279L);
        setLongField(term250509, term250509.getClass(), "totalMasterAchievement", -1889180307680279918L);
        setLongField(term250509, term250509.getClass(), "totalReMasterAchievement", -5514989374457730893L);
        setLongField(term250509, term250509.getClass(), "playerOldRating", -2647809894517995240L);
        setLongField(term250509, term250509.getClass(), "playerNewRating", 4434507544139240673L);
        setIntField(term250509, term250509.getClass(), "banState", 1682205203);
        setLongField(term250509, term250509.getClass(), "dateTime", -4362858330120866728L);
        term250866 = new Long(-1300122275302674838L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term250866;
        callMethod(klass, "setContentBit", argTypes, term250509, args);
    }

};


