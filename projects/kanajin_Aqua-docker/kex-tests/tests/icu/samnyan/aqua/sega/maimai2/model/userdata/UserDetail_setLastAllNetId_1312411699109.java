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

public class UserDetail_setLastAllNetId_1312411699109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257495;
     Object term257860;

    public UserDetail_setLastAllNetId_1312411699109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term257499 = new Long(-599981502351912419L);
        Integer term257562 = new Integer(-1945165354);
        Integer term257564 = new Integer(14341670);
        Integer term257566 = new Integer(-144022361);
        Integer term257568 = new Integer(-1419212893);
        Integer term257570 = new Integer(-457189882);
        Integer term257572 = new Integer(-1227023001);
        ArrayList term257560 = new ArrayList();
        ((ArrayList) term257560).add(term257562);
        ((ArrayList) term257560).add(term257564);
        ((ArrayList) term257560).add(term257566);
        ((ArrayList) term257560).add(term257568);
        ((ArrayList) term257560).add(term257570);
        ((ArrayList) term257560).add(term257572);
        Integer term257578 = new Integer(-622827471);
        Integer term257580 = new Integer(-1759579486);
        Integer term257582 = new Integer(147748970);
        Integer term257584 = new Integer(-459525196);
        Integer term257586 = new Integer(2129073623);
        Integer term257588 = new Integer(-1623896406);
        Integer term257590 = new Integer(-1767855347);
        ArrayList term257576 = new ArrayList();
        ((ArrayList) term257576).add(term257578);
        ((ArrayList) term257576).add(term257580);
        ((ArrayList) term257576).add(term257582);
        ((ArrayList) term257576).add(term257584);
        ((ArrayList) term257576).add(term257586);
        ((ArrayList) term257576).add(term257588);
        ((ArrayList) term257576).add(term257590);
        term257495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term257497 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term257513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257518 = newInstance(Class.forName("java.time.LocalTime"));
        Object term257523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257528 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term257495, term257495.getClass(), "id", 4624943688495209296L);
        setLongField(term257497, term257497.getClass(), "id", -4430722967405374865L);
        setField(term257497, term257497.getClass(), "extId", term257499);
        setField(term257497, term257497.getClass(), "luid", "ClJWxuFhvY");
        setIntField(term257514, term257514.getClass(), "year", 2028);
        setShortField(term257514, term257514.getClass(), "month", (short) 12);
        setShortField(term257514, term257514.getClass(), "day", (short) 5);
        setField(term257513, term257513.getClass(), "date", term257514);
        setByteField(term257518, term257518.getClass(), "hour", (byte) 0);
        setByteField(term257518, term257518.getClass(), "minute", (byte) 4);
        setByteField(term257518, term257518.getClass(), "second", (byte) 24);
        setIntField(term257518, term257518.getClass(), "nano", 25841507);
        setField(term257513, term257513.getClass(), "time", term257518);
        setField(term257497, term257497.getClass(), "registerTime", term257513);
        setIntField(term257524, term257524.getClass(), "year", 2012);
        setShortField(term257524, term257524.getClass(), "month", (short) 2);
        setShortField(term257524, term257524.getClass(), "day", (short) 25);
        setField(term257523, term257523.getClass(), "date", term257524);
        setByteField(term257528, term257528.getClass(), "hour", (byte) 23);
        setByteField(term257528, term257528.getClass(), "minute", (byte) 35);
        setByteField(term257528, term257528.getClass(), "second", (byte) 51);
        setIntField(term257528, term257528.getClass(), "nano", 181227985);
        setField(term257523, term257523.getClass(), "time", term257528);
        setField(term257497, term257497.getClass(), "accessTime", term257523);
        setField(term257495, term257495.getClass(), "card", term257497);
        setField(term257495, term257495.getClass(), "userName", "owPqnSCjlr");
        setIntField(term257495, term257495.getClass(), "isNetMember", 495648720);
        setIntField(term257495, term257495.getClass(), "iconId", -1601485867);
        setIntField(term257495, term257495.getClass(), "plateId", 1998131577);
        setIntField(term257495, term257495.getClass(), "titleId", -796385132);
        setIntField(term257495, term257495.getClass(), "partnerId", 764130450);
        setIntField(term257495, term257495.getClass(), "frameId", 88245264);
        setIntField(term257495, term257495.getClass(), "selectMapId", 1442828973);
        setIntField(term257495, term257495.getClass(), "totalAwake", 935972072);
        setIntField(term257495, term257495.getClass(), "gradeRating", 150265946);
        setIntField(term257495, term257495.getClass(), "musicRating", 1626027490);
        setIntField(term257495, term257495.getClass(), "playerRating", -1464025625);
        setIntField(term257495, term257495.getClass(), "highestRating", 2015899963);
        setIntField(term257495, term257495.getClass(), "gradeRank", 679633464);
        setIntField(term257495, term257495.getClass(), "classRank", 696207020);
        setIntField(term257495, term257495.getClass(), "courseRank", -764517409);
        setField(term257495, term257495.getClass(), "charaSlot", term257560);
        setField(term257495, term257495.getClass(), "charaLockSlot", term257576);
        setLongField(term257495, term257495.getClass(), "contentBit", -7789740144037953814L);
        setIntField(term257495, term257495.getClass(), "playCount", -1031341811);
        setField(term257495, term257495.getClass(), "eventWatchedDate", "bstKSThCsH");
        setField(term257495, term257495.getClass(), "lastGameId", "QuJUFXGoAL");
        setField(term257495, term257495.getClass(), "lastRomVersion", "NHyvoceYPA");
        setField(term257495, term257495.getClass(), "lastDataVersion", "zvfYpTBhsN");
        setField(term257495, term257495.getClass(), "lastLoginDate", "SInylFGlyL");
        setField(term257495, term257495.getClass(), "lastPlayDate", "vTqdPzKttw");
        setIntField(term257495, term257495.getClass(), "lastPlayCredit", 1746547938);
        setIntField(term257495, term257495.getClass(), "lastPlayMode", -1990552588);
        setIntField(term257495, term257495.getClass(), "lastPlaceId", 866467788);
        setField(term257495, term257495.getClass(), "lastPlaceName", "UaULhxzYkE");
        setIntField(term257495, term257495.getClass(), "lastAllNetId", -309416237);
        setIntField(term257495, term257495.getClass(), "lastRegionId", -1872979717);
        setField(term257495, term257495.getClass(), "lastRegionName", "DkwiMryAQU");
        setField(term257495, term257495.getClass(), "lastClientId", "mVdlxSSqUp");
        setField(term257495, term257495.getClass(), "lastCountryCode", "uLrjpWhGzA");
        setIntField(term257495, term257495.getClass(), "lastSelectEMoney", 1715864149);
        setIntField(term257495, term257495.getClass(), "lastSelectTicket", -508840627);
        setIntField(term257495, term257495.getClass(), "lastSelectCourse", -207704563);
        setIntField(term257495, term257495.getClass(), "lastCountCourse", -661250152);
        setField(term257495, term257495.getClass(), "firstGameId", "vwfIkOlVZd");
        setField(term257495, term257495.getClass(), "firstRomVersion", "MceqIBCmbY");
        setField(term257495, term257495.getClass(), "firstDataVersion", "rlUBuxBZan");
        setField(term257495, term257495.getClass(), "firstPlayDate", "xcfVTYHLJQ");
        setField(term257495, term257495.getClass(), "compatibleCmVersion", "pcqiKdOHBV");
        setField(term257495, term257495.getClass(), "dailyBonusDate", "rXuZuSwWYH");
        setField(term257495, term257495.getClass(), "dailyCourseBonusDate", "dxRMTzPEIm");
        setField(term257495, term257495.getClass(), "lastPairLoginDate", "HXmJcdlvRm");
        setField(term257495, term257495.getClass(), "lastTrialPlayDate", "SIFtikilxs");
        setIntField(term257495, term257495.getClass(), "playVsCount", 1420332983);
        setIntField(term257495, term257495.getClass(), "playSyncCount", 682985613);
        setIntField(term257495, term257495.getClass(), "winCount", 2335384);
        setIntField(term257495, term257495.getClass(), "helpCount", -2073470721);
        setIntField(term257495, term257495.getClass(), "comboCount", 1081791680);
        setLongField(term257495, term257495.getClass(), "totalDeluxscore", 7495148833839974844L);
        setLongField(term257495, term257495.getClass(), "totalBasicDeluxscore", -3151619145835660154L);
        setLongField(term257495, term257495.getClass(), "totalAdvancedDeluxscore", -615305132334082895L);
        setLongField(term257495, term257495.getClass(), "totalExpertDeluxscore", -6222492840703428507L);
        setLongField(term257495, term257495.getClass(), "totalMasterDeluxscore", -4848977483031815468L);
        setLongField(term257495, term257495.getClass(), "totalReMasterDeluxscore", 2100985294388649841L);
        setIntField(term257495, term257495.getClass(), "totalSync", 818689185);
        setIntField(term257495, term257495.getClass(), "totalBasicSync", 1510353216);
        setIntField(term257495, term257495.getClass(), "totalAdvancedSync", 2040409009);
        setIntField(term257495, term257495.getClass(), "totalExpertSync", 778873226);
        setIntField(term257495, term257495.getClass(), "totalMasterSync", -88095693);
        setIntField(term257495, term257495.getClass(), "totalReMasterSync", 1745511833);
        setLongField(term257495, term257495.getClass(), "totalAchievement", -2972203237880727553L);
        setLongField(term257495, term257495.getClass(), "totalBasicAchievement", -9167302788579041371L);
        setLongField(term257495, term257495.getClass(), "totalAdvancedAchievement", 8452692418775893349L);
        setLongField(term257495, term257495.getClass(), "totalExpertAchievement", 8029034886926074539L);
        setLongField(term257495, term257495.getClass(), "totalMasterAchievement", -7166174464227217710L);
        setLongField(term257495, term257495.getClass(), "totalReMasterAchievement", -3920426427349414202L);
        setLongField(term257495, term257495.getClass(), "playerOldRating", -96242696166926282L);
        setLongField(term257495, term257495.getClass(), "playerNewRating", -8660581989794655758L);
        setIntField(term257495, term257495.getClass(), "banState", -186574934);
        setLongField(term257495, term257495.getClass(), "dateTime", -2392114960471042205L);
        term257860 = new Integer(41148822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term257860;
        callMethod(klass, "setLastAllNetId", argTypes, term257495, args);
    }

};


