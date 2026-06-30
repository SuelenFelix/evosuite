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

public class UserFriendSeasonRanking_getId_2338666551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15197;

    public UserFriendSeasonRanking_getId_2338666551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15203 = new Long(-7672528020740371001L);
        Integer term15266 = new Integer(-1146679443);
        Integer term15268 = new Integer(-860131894);
        ArrayList term15264 = new ArrayList();
        ((ArrayList) term15264).add(term15266);
        ((ArrayList) term15264).add(term15268);
        Integer term15274 = new Integer(-1022990421);
        Integer term15276 = new Integer(1045547089);
        Integer term15278 = new Integer(-1122880881);
        Integer term15280 = new Integer(-542712742);
        Integer term15282 = new Integer(-1254072822);
        ArrayList term15272 = new ArrayList();
        ((ArrayList) term15272).add(term15274);
        ((ArrayList) term15272).add(term15276);
        ((ArrayList) term15272).add(term15278);
        ((ArrayList) term15272).add(term15280);
        ((ArrayList) term15272).add(term15282);
        term15197 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term15199 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term15201 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15222 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15232 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15197, term15197.getClass(), "id", 3447455321955655601L);
        setLongField(term15199, term15199.getClass(), "id", -6503611645609982617L);
        setLongField(term15201, term15201.getClass(), "id", -7574091101944828886L);
        setField(term15201, term15201.getClass(), "extId", term15203);
        setField(term15201, term15201.getClass(), "luid", "tOszriqETr");
        setIntField(term15218, term15218.getClass(), "year", 2011);
        setShortField(term15218, term15218.getClass(), "month", (short) 6);
        setShortField(term15218, term15218.getClass(), "day", (short) 26);
        setField(term15217, term15217.getClass(), "date", term15218);
        setByteField(term15222, term15222.getClass(), "hour", (byte) 22);
        setByteField(term15222, term15222.getClass(), "minute", (byte) 39);
        setByteField(term15222, term15222.getClass(), "second", (byte) 11);
        setIntField(term15222, term15222.getClass(), "nano", 686293604);
        setField(term15217, term15217.getClass(), "time", term15222);
        setField(term15201, term15201.getClass(), "registerTime", term15217);
        setIntField(term15228, term15228.getClass(), "year", 2012);
        setShortField(term15228, term15228.getClass(), "month", (short) 7);
        setShortField(term15228, term15228.getClass(), "day", (short) 21);
        setField(term15227, term15227.getClass(), "date", term15228);
        setByteField(term15232, term15232.getClass(), "hour", (byte) 13);
        setByteField(term15232, term15232.getClass(), "minute", (byte) 41);
        setByteField(term15232, term15232.getClass(), "second", (byte) 44);
        setIntField(term15232, term15232.getClass(), "nano", 394467282);
        setField(term15227, term15227.getClass(), "time", term15232);
        setField(term15201, term15201.getClass(), "accessTime", term15227);
        setField(term15199, term15199.getClass(), "card", term15201);
        setField(term15199, term15199.getClass(), "userName", "ncSPTkhKjO");
        setIntField(term15199, term15199.getClass(), "isNetMember", 919994471);
        setIntField(term15199, term15199.getClass(), "iconId", 183531701);
        setIntField(term15199, term15199.getClass(), "plateId", -974923743);
        setIntField(term15199, term15199.getClass(), "titleId", 1876738932);
        setIntField(term15199, term15199.getClass(), "partnerId", -1870339027);
        setIntField(term15199, term15199.getClass(), "frameId", -1549603566);
        setIntField(term15199, term15199.getClass(), "selectMapId", 1077223540);
        setIntField(term15199, term15199.getClass(), "totalAwake", -1823813592);
        setIntField(term15199, term15199.getClass(), "gradeRating", -1644358555);
        setIntField(term15199, term15199.getClass(), "musicRating", -388591034);
        setIntField(term15199, term15199.getClass(), "playerRating", -1270258033);
        setIntField(term15199, term15199.getClass(), "highestRating", 1677994069);
        setIntField(term15199, term15199.getClass(), "gradeRank", -439999692);
        setIntField(term15199, term15199.getClass(), "classRank", 924095007);
        setIntField(term15199, term15199.getClass(), "courseRank", 1302110708);
        setField(term15199, term15199.getClass(), "charaSlot", term15264);
        setField(term15199, term15199.getClass(), "charaLockSlot", term15272);
        setLongField(term15199, term15199.getClass(), "contentBit", -6792339614909987294L);
        setIntField(term15199, term15199.getClass(), "playCount", 594705497);
        setField(term15199, term15199.getClass(), "eventWatchedDate", "jcWKHRWhyj");
        setField(term15199, term15199.getClass(), "lastGameId", "nrQjODRMLD");
        setField(term15199, term15199.getClass(), "lastRomVersion", "PNoWXrsFic");
        setField(term15199, term15199.getClass(), "lastDataVersion", "QZBHZqZope");
        setField(term15199, term15199.getClass(), "lastLoginDate", "VBUahCvyxC");
        setField(term15199, term15199.getClass(), "lastPlayDate", "MlzTkzKMCX");
        setIntField(term15199, term15199.getClass(), "lastPlayCredit", -600102466);
        setIntField(term15199, term15199.getClass(), "lastPlayMode", -899986714);
        setIntField(term15199, term15199.getClass(), "lastPlaceId", 1307244466);
        setField(term15199, term15199.getClass(), "lastPlaceName", "UqKUbMyPMJ");
        setIntField(term15199, term15199.getClass(), "lastAllNetId", -252262096);
        setIntField(term15199, term15199.getClass(), "lastRegionId", -37129068);
        setField(term15199, term15199.getClass(), "lastRegionName", "QpYltHAdyY");
        setField(term15199, term15199.getClass(), "lastClientId", "lbmSGBwIiV");
        setField(term15199, term15199.getClass(), "lastCountryCode", "DAxyHoTLzZ");
        setIntField(term15199, term15199.getClass(), "lastSelectEMoney", -861014847);
        setIntField(term15199, term15199.getClass(), "lastSelectTicket", 2132934139);
        setIntField(term15199, term15199.getClass(), "lastSelectCourse", -1261824381);
        setIntField(term15199, term15199.getClass(), "lastCountCourse", 1594426218);
        setField(term15199, term15199.getClass(), "firstGameId", "fhZgTouhCC");
        setField(term15199, term15199.getClass(), "firstRomVersion", "wrikqJwXvL");
        setField(term15199, term15199.getClass(), "firstDataVersion", "UiWhvbypdr");
        setField(term15199, term15199.getClass(), "firstPlayDate", "CgleElJNje");
        setField(term15199, term15199.getClass(), "compatibleCmVersion", "ZrchvNGMtd");
        setField(term15199, term15199.getClass(), "dailyBonusDate", "WaEcyVlcIx");
        setField(term15199, term15199.getClass(), "dailyCourseBonusDate", "ONcbPCQnHd");
        setField(term15199, term15199.getClass(), "lastPairLoginDate", "AobDaplFLl");
        setField(term15199, term15199.getClass(), "lastTrialPlayDate", "pDkMNnAGgv");
        setIntField(term15199, term15199.getClass(), "playVsCount", -2060535464);
        setIntField(term15199, term15199.getClass(), "playSyncCount", -1242946317);
        setIntField(term15199, term15199.getClass(), "winCount", -1541566235);
        setIntField(term15199, term15199.getClass(), "helpCount", -189738995);
        setIntField(term15199, term15199.getClass(), "comboCount", 1943019963);
        setLongField(term15199, term15199.getClass(), "totalDeluxscore", -1978508496784157882L);
        setLongField(term15199, term15199.getClass(), "totalBasicDeluxscore", -7840999196900383276L);
        setLongField(term15199, term15199.getClass(), "totalAdvancedDeluxscore", 1528628920302068646L);
        setLongField(term15199, term15199.getClass(), "totalExpertDeluxscore", 3161040540173678206L);
        setLongField(term15199, term15199.getClass(), "totalMasterDeluxscore", 8640463098965331396L);
        setLongField(term15199, term15199.getClass(), "totalReMasterDeluxscore", -4136906775323730350L);
        setIntField(term15199, term15199.getClass(), "totalSync", 186472650);
        setIntField(term15199, term15199.getClass(), "totalBasicSync", 279675992);
        setIntField(term15199, term15199.getClass(), "totalAdvancedSync", -1626074989);
        setIntField(term15199, term15199.getClass(), "totalExpertSync", -552272253);
        setIntField(term15199, term15199.getClass(), "totalMasterSync", -633523956);
        setIntField(term15199, term15199.getClass(), "totalReMasterSync", 1761540885);
        setLongField(term15199, term15199.getClass(), "totalAchievement", 6381166215871562039L);
        setLongField(term15199, term15199.getClass(), "totalBasicAchievement", 7656211287234019484L);
        setLongField(term15199, term15199.getClass(), "totalAdvancedAchievement", -872579514000598474L);
        setLongField(term15199, term15199.getClass(), "totalExpertAchievement", 5097769785635819744L);
        setLongField(term15199, term15199.getClass(), "totalMasterAchievement", 9192899183781208922L);
        setLongField(term15199, term15199.getClass(), "totalReMasterAchievement", -7705159544905337794L);
        setLongField(term15199, term15199.getClass(), "playerOldRating", 678465732474023847L);
        setLongField(term15199, term15199.getClass(), "playerNewRating", 2551047634163864862L);
        setIntField(term15199, term15199.getClass(), "banState", -168498989);
        setLongField(term15199, term15199.getClass(), "dateTime", -6656996002079682356L);
        setField(term15197, term15197.getClass(), "user", term15199);
        setIntField(term15197, term15197.getClass(), "seasonId", 388247095);
        setIntField(term15197, term15197.getClass(), "point", -1320402633);
        setIntField(term15197, term15197.getClass(), "rank", 919602316);
        setBooleanField(term15197, term15197.getClass(), "rewardGet", false);
        setField(term15197, term15197.getClass(), "userName", "PaCpFXGzdX");
        setField(term15197, term15197.getClass(), "recordDate", "FftYCNbnks");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term15197, args);
    }

};


