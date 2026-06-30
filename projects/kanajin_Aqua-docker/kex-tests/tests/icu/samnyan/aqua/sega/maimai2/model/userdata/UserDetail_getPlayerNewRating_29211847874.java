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

public class UserDetail_getPlayerNewRating_29211847874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4271470;

    public UserDetail_getPlayerNewRating_29211847874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4271474 = new Long(8546808375918306560L);
        Integer term4271537 = new Integer(-1868643949);
        ArrayList term4271535 = new ArrayList();
        ((ArrayList) term4271535).add(term4271537);
        Integer term4271543 = new Integer(-83450776);
        Integer term4271545 = new Integer(-1598054225);
        Integer term4271547 = new Integer(2121939630);
        Integer term4271549 = new Integer(1336739947);
        ArrayList term4271541 = new ArrayList();
        ((ArrayList) term4271541).add(term4271543);
        ((ArrayList) term4271541).add(term4271545);
        ((ArrayList) term4271541).add(term4271547);
        ((ArrayList) term4271541).add(term4271549);
        term4271470 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4271472 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4271488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4271489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4271493 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4271498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4271499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4271503 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4271470, term4271470.getClass(), "id", 3034416019756992444L);
        setLongField(term4271472, term4271472.getClass(), "id", 4554504704939478723L);
        setField(term4271472, term4271472.getClass(), "extId", term4271474);
        setField(term4271472, term4271472.getClass(), "luid", "igDFQAJWHV");
        setIntField(term4271489, term4271489.getClass(), "year", 2020);
        setShortField(term4271489, term4271489.getClass(), "month", (short) 7);
        setShortField(term4271489, term4271489.getClass(), "day", (short) 26);
        setField(term4271488, term4271488.getClass(), "date", term4271489);
        setByteField(term4271493, term4271493.getClass(), "hour", (byte) 0);
        setByteField(term4271493, term4271493.getClass(), "minute", (byte) 15);
        setByteField(term4271493, term4271493.getClass(), "second", (byte) 0);
        setIntField(term4271493, term4271493.getClass(), "nano", 183642734);
        setField(term4271488, term4271488.getClass(), "time", term4271493);
        setField(term4271472, term4271472.getClass(), "registerTime", term4271488);
        setIntField(term4271499, term4271499.getClass(), "year", 2028);
        setShortField(term4271499, term4271499.getClass(), "month", (short) 4);
        setShortField(term4271499, term4271499.getClass(), "day", (short) 13);
        setField(term4271498, term4271498.getClass(), "date", term4271499);
        setByteField(term4271503, term4271503.getClass(), "hour", (byte) 16);
        setByteField(term4271503, term4271503.getClass(), "minute", (byte) 9);
        setByteField(term4271503, term4271503.getClass(), "second", (byte) 14);
        setIntField(term4271503, term4271503.getClass(), "nano", 958962993);
        setField(term4271498, term4271498.getClass(), "time", term4271503);
        setField(term4271472, term4271472.getClass(), "accessTime", term4271498);
        setField(term4271470, term4271470.getClass(), "card", term4271472);
        setField(term4271470, term4271470.getClass(), "userName", "HaepDgKmBh");
        setIntField(term4271470, term4271470.getClass(), "isNetMember", 1995067930);
        setIntField(term4271470, term4271470.getClass(), "iconId", 304634073);
        setIntField(term4271470, term4271470.getClass(), "plateId", 206007821);
        setIntField(term4271470, term4271470.getClass(), "titleId", -1406383860);
        setIntField(term4271470, term4271470.getClass(), "partnerId", 382793099);
        setIntField(term4271470, term4271470.getClass(), "frameId", -2123388683);
        setIntField(term4271470, term4271470.getClass(), "selectMapId", 1592857079);
        setIntField(term4271470, term4271470.getClass(), "totalAwake", -1204725648);
        setIntField(term4271470, term4271470.getClass(), "gradeRating", -1909612750);
        setIntField(term4271470, term4271470.getClass(), "musicRating", 1814814340);
        setIntField(term4271470, term4271470.getClass(), "playerRating", -24968977);
        setIntField(term4271470, term4271470.getClass(), "highestRating", -1617122144);
        setIntField(term4271470, term4271470.getClass(), "gradeRank", -2020148466);
        setIntField(term4271470, term4271470.getClass(), "classRank", -297090400);
        setIntField(term4271470, term4271470.getClass(), "courseRank", 1359159984);
        setField(term4271470, term4271470.getClass(), "charaSlot", term4271535);
        setField(term4271470, term4271470.getClass(), "charaLockSlot", term4271541);
        setLongField(term4271470, term4271470.getClass(), "contentBit", 6355398955238904680L);
        setIntField(term4271470, term4271470.getClass(), "playCount", -537633737);
        setField(term4271470, term4271470.getClass(), "eventWatchedDate", "yfyrrjOcnM");
        setField(term4271470, term4271470.getClass(), "lastGameId", "WCxKmZdXhD");
        setField(term4271470, term4271470.getClass(), "lastRomVersion", "KWkUgUflDk");
        setField(term4271470, term4271470.getClass(), "lastDataVersion", "EQQkCCaBJm");
        setField(term4271470, term4271470.getClass(), "lastLoginDate", "aSFyYoVPRj");
        setField(term4271470, term4271470.getClass(), "lastPlayDate", "fmTaeJcrbK");
        setIntField(term4271470, term4271470.getClass(), "lastPlayCredit", 1571019230);
        setIntField(term4271470, term4271470.getClass(), "lastPlayMode", -1992485002);
        setIntField(term4271470, term4271470.getClass(), "lastPlaceId", -1265754638);
        setField(term4271470, term4271470.getClass(), "lastPlaceName", "HEwCXAavSP");
        setIntField(term4271470, term4271470.getClass(), "lastAllNetId", -706134642);
        setIntField(term4271470, term4271470.getClass(), "lastRegionId", 1947029803);
        setField(term4271470, term4271470.getClass(), "lastRegionName", "bQnGeNOQPn");
        setField(term4271470, term4271470.getClass(), "lastClientId", "BhLZXEseso");
        setField(term4271470, term4271470.getClass(), "lastCountryCode", "hzqZyKdtLg");
        setIntField(term4271470, term4271470.getClass(), "lastSelectEMoney", -1141779980);
        setIntField(term4271470, term4271470.getClass(), "lastSelectTicket", 890675728);
        setIntField(term4271470, term4271470.getClass(), "lastSelectCourse", 388143509);
        setIntField(term4271470, term4271470.getClass(), "lastCountCourse", 696539019);
        setField(term4271470, term4271470.getClass(), "firstGameId", "rWbMwRDtgm");
        setField(term4271470, term4271470.getClass(), "firstRomVersion", "tSVdZupcHv");
        setField(term4271470, term4271470.getClass(), "firstDataVersion", "pPvcFAleFF");
        setField(term4271470, term4271470.getClass(), "firstPlayDate", "kXQlKuPqig");
        setField(term4271470, term4271470.getClass(), "compatibleCmVersion", "QkHQieFHJz");
        setField(term4271470, term4271470.getClass(), "dailyBonusDate", "nrECEFTLCS");
        setField(term4271470, term4271470.getClass(), "dailyCourseBonusDate", "adhHdIIxFA");
        setField(term4271470, term4271470.getClass(), "lastPairLoginDate", "aQCQcYmpgH");
        setField(term4271470, term4271470.getClass(), "lastTrialPlayDate", "wUPmXHUeNR");
        setIntField(term4271470, term4271470.getClass(), "playVsCount", -337724736);
        setIntField(term4271470, term4271470.getClass(), "playSyncCount", 2124228330);
        setIntField(term4271470, term4271470.getClass(), "winCount", 1217509350);
        setIntField(term4271470, term4271470.getClass(), "helpCount", -1550950109);
        setIntField(term4271470, term4271470.getClass(), "comboCount", 675129963);
        setLongField(term4271470, term4271470.getClass(), "totalDeluxscore", -1326456050859293L);
        setLongField(term4271470, term4271470.getClass(), "totalBasicDeluxscore", 4111756923719256140L);
        setLongField(term4271470, term4271470.getClass(), "totalAdvancedDeluxscore", 8743858946212131424L);
        setLongField(term4271470, term4271470.getClass(), "totalExpertDeluxscore", -2837849370579462917L);
        setLongField(term4271470, term4271470.getClass(), "totalMasterDeluxscore", 847745690044834680L);
        setLongField(term4271470, term4271470.getClass(), "totalReMasterDeluxscore", -5948036707175159466L);
        setIntField(term4271470, term4271470.getClass(), "totalSync", -1706473716);
        setIntField(term4271470, term4271470.getClass(), "totalBasicSync", -1167484905);
        setIntField(term4271470, term4271470.getClass(), "totalAdvancedSync", 2029043821);
        setIntField(term4271470, term4271470.getClass(), "totalExpertSync", 1600443622);
        setIntField(term4271470, term4271470.getClass(), "totalMasterSync", 532420623);
        setIntField(term4271470, term4271470.getClass(), "totalReMasterSync", -1748472753);
        setLongField(term4271470, term4271470.getClass(), "totalAchievement", 2324725700007676113L);
        setLongField(term4271470, term4271470.getClass(), "totalBasicAchievement", -1781244085325114542L);
        setLongField(term4271470, term4271470.getClass(), "totalAdvancedAchievement", -3849669938070342175L);
        setLongField(term4271470, term4271470.getClass(), "totalExpertAchievement", -1716043764432935938L);
        setLongField(term4271470, term4271470.getClass(), "totalMasterAchievement", -4501626639650179697L);
        setLongField(term4271470, term4271470.getClass(), "totalReMasterAchievement", 7565326259971334340L);
        setLongField(term4271470, term4271470.getClass(), "playerOldRating", 4298729330004715290L);
        setLongField(term4271470, term4271470.getClass(), "playerNewRating", -8249751498344446738L);
        setIntField(term4271470, term4271470.getClass(), "banState", -1721053382);
        setLongField(term4271470, term4271470.getClass(), "dateTime", -2485131251876068038L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerNewRating", argTypes, term4271470, args);
    }

};


