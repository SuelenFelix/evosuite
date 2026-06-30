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

public class UserDetail_setContentBit_18051146898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250564;
     Object term250921;

    public UserDetail_setContentBit_18051146898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term250568 = new Long(-3565554762799701668L);
        Integer term250631 = new Integer(805890273);
        Integer term250633 = new Integer(1078863472);
        Integer term250635 = new Integer(-1845619952);
        ArrayList term250629 = new ArrayList();
        ((ArrayList) term250629).add(term250631);
        ((ArrayList) term250629).add(term250633);
        ((ArrayList) term250629).add(term250635);
        Integer term250641 = new Integer(-1363744441);
        Integer term250643 = new Integer(-1303828030);
        Integer term250645 = new Integer(1611629079);
        Integer term250647 = new Integer(770171276);
        Integer term250649 = new Integer(-1497914215);
        Integer term250651 = new Integer(254385018);
        ArrayList term250639 = new ArrayList();
        ((ArrayList) term250639).add(term250641);
        ((ArrayList) term250639).add(term250643);
        ((ArrayList) term250639).add(term250645);
        ((ArrayList) term250639).add(term250647);
        ((ArrayList) term250639).add(term250649);
        ((ArrayList) term250639).add(term250651);
        term250564 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term250566 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term250582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250597 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term250564, term250564.getClass(), "id", 2509858921984830081L);
        setLongField(term250566, term250566.getClass(), "id", 3336585092088783329L);
        setField(term250566, term250566.getClass(), "extId", term250568);
        setField(term250566, term250566.getClass(), "luid", "KxinsOQMeG");
        setIntField(term250583, term250583.getClass(), "year", 2024);
        setShortField(term250583, term250583.getClass(), "month", (short) 7);
        setShortField(term250583, term250583.getClass(), "day", (short) 15);
        setField(term250582, term250582.getClass(), "date", term250583);
        setByteField(term250587, term250587.getClass(), "hour", (byte) 14);
        setByteField(term250587, term250587.getClass(), "minute", (byte) 18);
        setByteField(term250587, term250587.getClass(), "second", (byte) 58);
        setIntField(term250587, term250587.getClass(), "nano", 537827095);
        setField(term250582, term250582.getClass(), "time", term250587);
        setField(term250566, term250566.getClass(), "registerTime", term250582);
        setIntField(term250593, term250593.getClass(), "year", 2025);
        setShortField(term250593, term250593.getClass(), "month", (short) 9);
        setShortField(term250593, term250593.getClass(), "day", (short) 18);
        setField(term250592, term250592.getClass(), "date", term250593);
        setByteField(term250597, term250597.getClass(), "hour", (byte) 9);
        setByteField(term250597, term250597.getClass(), "minute", (byte) 14);
        setByteField(term250597, term250597.getClass(), "second", (byte) 26);
        setIntField(term250597, term250597.getClass(), "nano", 567071659);
        setField(term250592, term250592.getClass(), "time", term250597);
        setField(term250566, term250566.getClass(), "accessTime", term250592);
        setField(term250564, term250564.getClass(), "card", term250566);
        setField(term250564, term250564.getClass(), "userName", "mbuEVrmMpD");
        setIntField(term250564, term250564.getClass(), "isNetMember", 1928083323);
        setIntField(term250564, term250564.getClass(), "iconId", -267430690);
        setIntField(term250564, term250564.getClass(), "plateId", 745712799);
        setIntField(term250564, term250564.getClass(), "titleId", 784378668);
        setIntField(term250564, term250564.getClass(), "partnerId", -1242913019);
        setIntField(term250564, term250564.getClass(), "frameId", 1086277183);
        setIntField(term250564, term250564.getClass(), "selectMapId", -546285718);
        setIntField(term250564, term250564.getClass(), "totalAwake", 233439438);
        setIntField(term250564, term250564.getClass(), "gradeRating", -17888307);
        setIntField(term250564, term250564.getClass(), "musicRating", 1613820074);
        setIntField(term250564, term250564.getClass(), "playerRating", 434316238);
        setIntField(term250564, term250564.getClass(), "highestRating", 1100995892);
        setIntField(term250564, term250564.getClass(), "gradeRank", 2043611175);
        setIntField(term250564, term250564.getClass(), "classRank", 645234038);
        setIntField(term250564, term250564.getClass(), "courseRank", -1080336027);
        setField(term250564, term250564.getClass(), "charaSlot", term250629);
        setField(term250564, term250564.getClass(), "charaLockSlot", term250639);
        setLongField(term250564, term250564.getClass(), "contentBit", -6063691827303829997L);
        setIntField(term250564, term250564.getClass(), "playCount", 707070705);
        setField(term250564, term250564.getClass(), "eventWatchedDate", "gQGlISxORX");
        setField(term250564, term250564.getClass(), "lastGameId", "IhgSPsiEAp");
        setField(term250564, term250564.getClass(), "lastRomVersion", "VIiDjdCWsX");
        setField(term250564, term250564.getClass(), "lastDataVersion", "HUpXsvCasn");
        setField(term250564, term250564.getClass(), "lastLoginDate", "gxKFHEvCMQ");
        setField(term250564, term250564.getClass(), "lastPlayDate", "WGrgiaSQnl");
        setIntField(term250564, term250564.getClass(), "lastPlayCredit", -1572025779);
        setIntField(term250564, term250564.getClass(), "lastPlayMode", -1700572838);
        setIntField(term250564, term250564.getClass(), "lastPlaceId", 2113787021);
        setField(term250564, term250564.getClass(), "lastPlaceName", "FdPORhHvkS");
        setIntField(term250564, term250564.getClass(), "lastAllNetId", -1284796207);
        setIntField(term250564, term250564.getClass(), "lastRegionId", -864683352);
        setField(term250564, term250564.getClass(), "lastRegionName", "HheeaUYjPr");
        setField(term250564, term250564.getClass(), "lastClientId", "nyKmTaUwFt");
        setField(term250564, term250564.getClass(), "lastCountryCode", "rzqaoonvCb");
        setIntField(term250564, term250564.getClass(), "lastSelectEMoney", -335374489);
        setIntField(term250564, term250564.getClass(), "lastSelectTicket", -1715333049);
        setIntField(term250564, term250564.getClass(), "lastSelectCourse", -246990874);
        setIntField(term250564, term250564.getClass(), "lastCountCourse", -49493427);
        setField(term250564, term250564.getClass(), "firstGameId", "DHAcIlnUmH");
        setField(term250564, term250564.getClass(), "firstRomVersion", "PXpuIQuvxu");
        setField(term250564, term250564.getClass(), "firstDataVersion", "RGuievXeWF");
        setField(term250564, term250564.getClass(), "firstPlayDate", "RNWAfuYVdn");
        setField(term250564, term250564.getClass(), "compatibleCmVersion", "hZuxPbhKHd");
        setField(term250564, term250564.getClass(), "dailyBonusDate", "owuVENinAF");
        setField(term250564, term250564.getClass(), "dailyCourseBonusDate", "wrEbOqtEzd");
        setField(term250564, term250564.getClass(), "lastPairLoginDate", "wnmgduZOMm");
        setField(term250564, term250564.getClass(), "lastTrialPlayDate", "CunxEcVQZW");
        setIntField(term250564, term250564.getClass(), "playVsCount", -746387656);
        setIntField(term250564, term250564.getClass(), "playSyncCount", 236632672);
        setIntField(term250564, term250564.getClass(), "winCount", -1778786592);
        setIntField(term250564, term250564.getClass(), "helpCount", 529851849);
        setIntField(term250564, term250564.getClass(), "comboCount", -32810393);
        setLongField(term250564, term250564.getClass(), "totalDeluxscore", 336643214054124311L);
        setLongField(term250564, term250564.getClass(), "totalBasicDeluxscore", -1226402360260801904L);
        setLongField(term250564, term250564.getClass(), "totalAdvancedDeluxscore", -3566667472714372629L);
        setLongField(term250564, term250564.getClass(), "totalExpertDeluxscore", -8274474188131459447L);
        setLongField(term250564, term250564.getClass(), "totalMasterDeluxscore", -7007598071998701823L);
        setLongField(term250564, term250564.getClass(), "totalReMasterDeluxscore", 2079354530625693937L);
        setIntField(term250564, term250564.getClass(), "totalSync", 318797269);
        setIntField(term250564, term250564.getClass(), "totalBasicSync", 1122053794);
        setIntField(term250564, term250564.getClass(), "totalAdvancedSync", 1089884193);
        setIntField(term250564, term250564.getClass(), "totalExpertSync", -1270471358);
        setIntField(term250564, term250564.getClass(), "totalMasterSync", 2014064499);
        setIntField(term250564, term250564.getClass(), "totalReMasterSync", 796034065);
        setLongField(term250564, term250564.getClass(), "totalAchievement", 8810222422010860794L);
        setLongField(term250564, term250564.getClass(), "totalBasicAchievement", -61756079163308321L);
        setLongField(term250564, term250564.getClass(), "totalAdvancedAchievement", 5262523692712566229L);
        setLongField(term250564, term250564.getClass(), "totalExpertAchievement", -2784334583718983279L);
        setLongField(term250564, term250564.getClass(), "totalMasterAchievement", -1889180307680279918L);
        setLongField(term250564, term250564.getClass(), "totalReMasterAchievement", -5514989374457730893L);
        setLongField(term250564, term250564.getClass(), "playerOldRating", -2647809894517995240L);
        setLongField(term250564, term250564.getClass(), "playerNewRating", 4434507544139240673L);
        setIntField(term250564, term250564.getClass(), "banState", 1682205203);
        setLongField(term250564, term250564.getClass(), "dateTime", -4362858330120866728L);
        term250921 = new Long(-1300122275302674838L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term250921;
        callMethod(klass, "setContentBit", argTypes, term250564, args);
    }

};


