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

public class UserDetail_setLastLoginDate_162893736103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4288114;

    public UserDetail_setLastLoginDate_162893736103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4288118 = new Long(-8477618123087365585L);
        Integer term4288181 = new Integer(1871723856);
        Integer term4288183 = new Integer(-159300758);
        Integer term4288185 = new Integer(478919523);
        Integer term4288187 = new Integer(-922902226);
        Integer term4288189 = new Integer(-2136789857);
        Integer term4288191 = new Integer(2107900783);
        Integer term4288193 = new Integer(2014990351);
        Integer term4288195 = new Integer(1711544909);
        Integer term4288197 = new Integer(-257220805);
        ArrayList term4288179 = new ArrayList();
        ((ArrayList) term4288179).add(term4288181);
        ((ArrayList) term4288179).add(term4288183);
        ((ArrayList) term4288179).add(term4288185);
        ((ArrayList) term4288179).add(term4288187);
        ((ArrayList) term4288179).add(term4288189);
        ((ArrayList) term4288179).add(term4288191);
        ((ArrayList) term4288179).add(term4288193);
        ((ArrayList) term4288179).add(term4288195);
        ((ArrayList) term4288179).add(term4288197);
        Integer term4288203 = new Integer(-32183821);
        Integer term4288205 = new Integer(391771406);
        Integer term4288207 = new Integer(930395359);
        Integer term4288209 = new Integer(510293262);
        ArrayList term4288201 = new ArrayList();
        ((ArrayList) term4288201).add(term4288203);
        ((ArrayList) term4288201).add(term4288205);
        ((ArrayList) term4288201).add(term4288207);
        ((ArrayList) term4288201).add(term4288209);
        term4288114 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4288116 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4288132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4288133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4288137 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4288142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4288143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4288147 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4288114, term4288114.getClass(), "id", 7390868707697131909L);
        setLongField(term4288116, term4288116.getClass(), "id", 4078086307246367289L);
        setField(term4288116, term4288116.getClass(), "extId", term4288118);
        setField(term4288116, term4288116.getClass(), "luid", "tzksIqDQqz");
        setIntField(term4288133, term4288133.getClass(), "year", 2022);
        setShortField(term4288133, term4288133.getClass(), "month", (short) 12);
        setShortField(term4288133, term4288133.getClass(), "day", (short) 18);
        setField(term4288132, term4288132.getClass(), "date", term4288133);
        setByteField(term4288137, term4288137.getClass(), "hour", (byte) 4);
        setByteField(term4288137, term4288137.getClass(), "minute", (byte) 57);
        setByteField(term4288137, term4288137.getClass(), "second", (byte) 33);
        setIntField(term4288137, term4288137.getClass(), "nano", 537280029);
        setField(term4288132, term4288132.getClass(), "time", term4288137);
        setField(term4288116, term4288116.getClass(), "registerTime", term4288132);
        setIntField(term4288143, term4288143.getClass(), "year", 2026);
        setShortField(term4288143, term4288143.getClass(), "month", (short) 7);
        setShortField(term4288143, term4288143.getClass(), "day", (short) 28);
        setField(term4288142, term4288142.getClass(), "date", term4288143);
        setByteField(term4288147, term4288147.getClass(), "hour", (byte) 10);
        setByteField(term4288147, term4288147.getClass(), "minute", (byte) 30);
        setByteField(term4288147, term4288147.getClass(), "second", (byte) 7);
        setIntField(term4288147, term4288147.getClass(), "nano", 7110051);
        setField(term4288142, term4288142.getClass(), "time", term4288147);
        setField(term4288116, term4288116.getClass(), "accessTime", term4288142);
        setField(term4288114, term4288114.getClass(), "card", term4288116);
        setField(term4288114, term4288114.getClass(), "userName", "DuDeGAkbrk");
        setIntField(term4288114, term4288114.getClass(), "isNetMember", 1004092163);
        setIntField(term4288114, term4288114.getClass(), "iconId", 1822941613);
        setIntField(term4288114, term4288114.getClass(), "plateId", -490885378);
        setIntField(term4288114, term4288114.getClass(), "titleId", 1840527542);
        setIntField(term4288114, term4288114.getClass(), "partnerId", -838752227);
        setIntField(term4288114, term4288114.getClass(), "frameId", 1843178832);
        setIntField(term4288114, term4288114.getClass(), "selectMapId", 1496384759);
        setIntField(term4288114, term4288114.getClass(), "totalAwake", -1038947171);
        setIntField(term4288114, term4288114.getClass(), "gradeRating", -1891752730);
        setIntField(term4288114, term4288114.getClass(), "musicRating", -2069313642);
        setIntField(term4288114, term4288114.getClass(), "playerRating", 1995528028);
        setIntField(term4288114, term4288114.getClass(), "highestRating", 1392678150);
        setIntField(term4288114, term4288114.getClass(), "gradeRank", 1633868046);
        setIntField(term4288114, term4288114.getClass(), "classRank", -611232451);
        setIntField(term4288114, term4288114.getClass(), "courseRank", 1815302010);
        setField(term4288114, term4288114.getClass(), "charaSlot", term4288179);
        setField(term4288114, term4288114.getClass(), "charaLockSlot", term4288201);
        setLongField(term4288114, term4288114.getClass(), "contentBit", -7584432988736596440L);
        setIntField(term4288114, term4288114.getClass(), "playCount", -1121177258);
        setField(term4288114, term4288114.getClass(), "eventWatchedDate", "PHDuozwxyo");
        setField(term4288114, term4288114.getClass(), "lastGameId", "YjjqRzfFri");
        setField(term4288114, term4288114.getClass(), "lastRomVersion", "MxuaziOLDQ");
        setField(term4288114, term4288114.getClass(), "lastDataVersion", "hkEOsnReyx");
        setField(term4288114, term4288114.getClass(), "lastLoginDate", "jVyNzropzN");
        setField(term4288114, term4288114.getClass(), "lastPlayDate", "dmyAAUhrYJ");
        setIntField(term4288114, term4288114.getClass(), "lastPlayCredit", 1958066837);
        setIntField(term4288114, term4288114.getClass(), "lastPlayMode", 1836746305);
        setIntField(term4288114, term4288114.getClass(), "lastPlaceId", 513822112);
        setField(term4288114, term4288114.getClass(), "lastPlaceName", "xDbZInTEUS");
        setIntField(term4288114, term4288114.getClass(), "lastAllNetId", -956511239);
        setIntField(term4288114, term4288114.getClass(), "lastRegionId", 1996086141);
        setField(term4288114, term4288114.getClass(), "lastRegionName", "VLzXhRdMKp");
        setField(term4288114, term4288114.getClass(), "lastClientId", "wAXpzbpPpR");
        setField(term4288114, term4288114.getClass(), "lastCountryCode", "AoMahNeJuS");
        setIntField(term4288114, term4288114.getClass(), "lastSelectEMoney", -281582718);
        setIntField(term4288114, term4288114.getClass(), "lastSelectTicket", -1719513102);
        setIntField(term4288114, term4288114.getClass(), "lastSelectCourse", 942226089);
        setIntField(term4288114, term4288114.getClass(), "lastCountCourse", -336240960);
        setField(term4288114, term4288114.getClass(), "firstGameId", "QwCrHEnqVv");
        setField(term4288114, term4288114.getClass(), "firstRomVersion", "SDtSGLOqWo");
        setField(term4288114, term4288114.getClass(), "firstDataVersion", "GzpGGrkKnc");
        setField(term4288114, term4288114.getClass(), "firstPlayDate", "noZNAzbsly");
        setField(term4288114, term4288114.getClass(), "compatibleCmVersion", "rGBLqEHfRZ");
        setField(term4288114, term4288114.getClass(), "dailyBonusDate", "aZpZVABEXP");
        setField(term4288114, term4288114.getClass(), "dailyCourseBonusDate", "GeXwTXblnm");
        setField(term4288114, term4288114.getClass(), "lastPairLoginDate", "XvsDeqtakP");
        setField(term4288114, term4288114.getClass(), "lastTrialPlayDate", "UoeRmAOtMT");
        setIntField(term4288114, term4288114.getClass(), "playVsCount", 1133925027);
        setIntField(term4288114, term4288114.getClass(), "playSyncCount", 63369852);
        setIntField(term4288114, term4288114.getClass(), "winCount", -1250484497);
        setIntField(term4288114, term4288114.getClass(), "helpCount", 1244481668);
        setIntField(term4288114, term4288114.getClass(), "comboCount", 2086106164);
        setLongField(term4288114, term4288114.getClass(), "totalDeluxscore", -7031228113524761130L);
        setLongField(term4288114, term4288114.getClass(), "totalBasicDeluxscore", -6326446677340436316L);
        setLongField(term4288114, term4288114.getClass(), "totalAdvancedDeluxscore", -7457102171340512086L);
        setLongField(term4288114, term4288114.getClass(), "totalExpertDeluxscore", -7351633147298147122L);
        setLongField(term4288114, term4288114.getClass(), "totalMasterDeluxscore", -392930908779683444L);
        setLongField(term4288114, term4288114.getClass(), "totalReMasterDeluxscore", -8729959013932403967L);
        setIntField(term4288114, term4288114.getClass(), "totalSync", 1655299210);
        setIntField(term4288114, term4288114.getClass(), "totalBasicSync", 1660349162);
        setIntField(term4288114, term4288114.getClass(), "totalAdvancedSync", -1970168436);
        setIntField(term4288114, term4288114.getClass(), "totalExpertSync", 1101545490);
        setIntField(term4288114, term4288114.getClass(), "totalMasterSync", -1677185226);
        setIntField(term4288114, term4288114.getClass(), "totalReMasterSync", 525528654);
        setLongField(term4288114, term4288114.getClass(), "totalAchievement", 1570576909431859007L);
        setLongField(term4288114, term4288114.getClass(), "totalBasicAchievement", -5371199748778740231L);
        setLongField(term4288114, term4288114.getClass(), "totalAdvancedAchievement", -8451056292391265544L);
        setLongField(term4288114, term4288114.getClass(), "totalExpertAchievement", 8208357205740774145L);
        setLongField(term4288114, term4288114.getClass(), "totalMasterAchievement", -585693346608037091L);
        setLongField(term4288114, term4288114.getClass(), "totalReMasterAchievement", -5324118832441579439L);
        setLongField(term4288114, term4288114.getClass(), "playerOldRating", -8613672402045452721L);
        setLongField(term4288114, term4288114.getClass(), "playerNewRating", 6405840746860434864L);
        setIntField(term4288114, term4288114.getClass(), "banState", -427325966);
        setLongField(term4288114, term4288114.getClass(), "dateTime", -145296039906842966L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XpJQGkGMcE";
        callMethod(klass, "setLastLoginDate", argTypes, term4288114, args);
    }

};


