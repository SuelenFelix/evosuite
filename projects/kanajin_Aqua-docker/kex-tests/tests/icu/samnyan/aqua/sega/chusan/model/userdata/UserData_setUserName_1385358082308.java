package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_setUserName_1385358082308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285292;

    public UserData_setUserName_1385358082308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285292 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285292, term285292.getClass(), "id", 0L);
        setField(term285292, term285292.getClass(), "card", null);
        setField(term285292, term285292.getClass(), "userName", null);
        setIntField(term285292, term285292.getClass(), "level", 0);
        setIntField(term285292, term285292.getClass(), "reincarnationNum", 0);
        setField(term285292, term285292.getClass(), "exp", null);
        setLongField(term285292, term285292.getClass(), "point", 0L);
        setLongField(term285292, term285292.getClass(), "totalPoint", 0L);
        setIntField(term285292, term285292.getClass(), "playCount", 0);
        setIntField(term285292, term285292.getClass(), "multiPlayCount", 0);
        setIntField(term285292, term285292.getClass(), "playerRating", 0);
        setIntField(term285292, term285292.getClass(), "highestRating", 0);
        setIntField(term285292, term285292.getClass(), "nameplateId", 0);
        setIntField(term285292, term285292.getClass(), "frameId", 0);
        setIntField(term285292, term285292.getClass(), "characterId", 0);
        setIntField(term285292, term285292.getClass(), "trophyId", 0);
        setIntField(term285292, term285292.getClass(), "playedTutorialBit", 0);
        setIntField(term285292, term285292.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285292, term285292.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285292, term285292.getClass(), "totalMapNum", 0);
        setLongField(term285292, term285292.getClass(), "totalHiScore", 0L);
        setLongField(term285292, term285292.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285292, term285292.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285292, term285292.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285292, term285292.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285292, term285292.getClass(), "totalUltimaHighScore", 0L);
        setField(term285292, term285292.getClass(), "eventWatchedDate", null);
        setIntField(term285292, term285292.getClass(), "friendCount", 0);
        setField(term285292, term285292.getClass(), "firstGameId", null);
        setField(term285292, term285292.getClass(), "firstRomVersion", null);
        setField(term285292, term285292.getClass(), "firstDataVersion", null);
        setField(term285292, term285292.getClass(), "firstPlayDate", null);
        setField(term285292, term285292.getClass(), "lastGameId", null);
        setField(term285292, term285292.getClass(), "lastRomVersion", null);
        setField(term285292, term285292.getClass(), "lastDataVersion", null);
        setField(term285292, term285292.getClass(), "lastLoginDate", null);
        setField(term285292, term285292.getClass(), "lastPlayDate", null);
        setIntField(term285292, term285292.getClass(), "lastPlaceId", 0);
        setField(term285292, term285292.getClass(), "lastPlaceName", null);
        setField(term285292, term285292.getClass(), "lastRegionId", null);
        setField(term285292, term285292.getClass(), "lastRegionName", null);
        setField(term285292, term285292.getClass(), "lastAllNetId", null);
        setField(term285292, term285292.getClass(), "lastClientId", null);
        setField(term285292, term285292.getClass(), "lastCountryCode", null);
        setField(term285292, term285292.getClass(), "userNameEx", null);
        setField(term285292, term285292.getClass(), "compatibleCmVersion", null);
        setIntField(term285292, term285292.getClass(), "medal", 0);
        setIntField(term285292, term285292.getClass(), "mapIconId", 0);
        setIntField(term285292, term285292.getClass(), "voiceId", 0);
        setIntField(term285292, term285292.getClass(), "avatarWear", 0);
        setIntField(term285292, term285292.getClass(), "avatarHead", 0);
        setIntField(term285292, term285292.getClass(), "avatarFace", 0);
        setIntField(term285292, term285292.getClass(), "avatarSkin", 0);
        setIntField(term285292, term285292.getClass(), "avatarItem", 0);
        setIntField(term285292, term285292.getClass(), "avatarFront", 0);
        setIntField(term285292, term285292.getClass(), "avatarBack", 0);
        setIntField(term285292, term285292.getClass(), "classEmblemBase", 0);
        setIntField(term285292, term285292.getClass(), "classEmblemMedal", 0);
        setIntField(term285292, term285292.getClass(), "stockedGridCount", 0);
        setIntField(term285292, term285292.getClass(), "exMapLoopCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattlePlayCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattleWinCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattleLoseCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285292, term285292.getClass(), "charaIllustId", 0);
        setIntField(term285292, term285292.getClass(), "skillId", 0);
        setIntField(term285292, term285292.getClass(), "overPowerPoint", 0);
        setIntField(term285292, term285292.getClass(), "overPowerRate", 0);
        setIntField(term285292, term285292.getClass(), "overPowerLowerRank", 0);
        setIntField(term285292, term285292.getClass(), "avatarPoint", 0);
        setIntField(term285292, term285292.getClass(), "battleRankId", 0);
        setIntField(term285292, term285292.getClass(), "battleRankPoint", 0);
        setIntField(term285292, term285292.getClass(), "eliteRankPoint", 0);
        setIntField(term285292, term285292.getClass(), "netBattle1stCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattle2ndCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattle3rdCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattle4thCount", 0);
        setIntField(term285292, term285292.getClass(), "netBattleCorrection", 0);
        setIntField(term285292, term285292.getClass(), "netBattleErrCnt", 0);
        setIntField(term285292, term285292.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285292, term285292.getClass(), "battleRewardStatus", 0);
        setIntField(term285292, term285292.getClass(), "battleRewardIndex", 0);
        setIntField(term285292, term285292.getClass(), "battleRewardCount", 0);
        setIntField(term285292, term285292.getClass(), "ext1", 0);
        setIntField(term285292, term285292.getClass(), "ext2", 0);
        setIntField(term285292, term285292.getClass(), "ext3", 0);
        setIntField(term285292, term285292.getClass(), "ext4", 0);
        setIntField(term285292, term285292.getClass(), "ext5", 0);
        setIntField(term285292, term285292.getClass(), "ext6", 0);
        setIntField(term285292, term285292.getClass(), "ext7", 0);
        setIntField(term285292, term285292.getClass(), "ext8", 0);
        setIntField(term285292, term285292.getClass(), "ext9", 0);
        setIntField(term285292, term285292.getClass(), "ext10", 0);
        setField(term285292, term285292.getClass(), "extStr1", null);
        setField(term285292, term285292.getClass(), "extStr2", null);
        setLongField(term285292, term285292.getClass(), "extLong1", 0L);
        setLongField(term285292, term285292.getClass(), "extLong2", 0L);
        setField(term285292, term285292.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285292, term285292.getClass(), "isNetBattleHost", false);
        setIntField(term285292, term285292.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term285292, args);
    }

};


