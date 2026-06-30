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

public class UserData_getNetBattleHostErrCnt_2075262212285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283519;

    public UserData_getNetBattleHostErrCnt_2075262212285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283519 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term283519, term283519.getClass(), "id", 0L);
        setField(term283519, term283519.getClass(), "card", null);
        setField(term283519, term283519.getClass(), "userName", null);
        setIntField(term283519, term283519.getClass(), "level", 0);
        setIntField(term283519, term283519.getClass(), "reincarnationNum", 0);
        setField(term283519, term283519.getClass(), "exp", null);
        setLongField(term283519, term283519.getClass(), "point", 0L);
        setLongField(term283519, term283519.getClass(), "totalPoint", 0L);
        setIntField(term283519, term283519.getClass(), "playCount", 0);
        setIntField(term283519, term283519.getClass(), "multiPlayCount", 0);
        setIntField(term283519, term283519.getClass(), "playerRating", 0);
        setIntField(term283519, term283519.getClass(), "highestRating", 0);
        setIntField(term283519, term283519.getClass(), "nameplateId", 0);
        setIntField(term283519, term283519.getClass(), "frameId", 0);
        setIntField(term283519, term283519.getClass(), "characterId", 0);
        setIntField(term283519, term283519.getClass(), "trophyId", 0);
        setIntField(term283519, term283519.getClass(), "playedTutorialBit", 0);
        setIntField(term283519, term283519.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term283519, term283519.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term283519, term283519.getClass(), "totalMapNum", 0);
        setLongField(term283519, term283519.getClass(), "totalHiScore", 0L);
        setLongField(term283519, term283519.getClass(), "totalBasicHighScore", 0L);
        setLongField(term283519, term283519.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term283519, term283519.getClass(), "totalExpertHighScore", 0L);
        setLongField(term283519, term283519.getClass(), "totalMasterHighScore", 0L);
        setLongField(term283519, term283519.getClass(), "totalUltimaHighScore", 0L);
        setField(term283519, term283519.getClass(), "eventWatchedDate", null);
        setIntField(term283519, term283519.getClass(), "friendCount", 0);
        setField(term283519, term283519.getClass(), "firstGameId", null);
        setField(term283519, term283519.getClass(), "firstRomVersion", null);
        setField(term283519, term283519.getClass(), "firstDataVersion", null);
        setField(term283519, term283519.getClass(), "firstPlayDate", null);
        setField(term283519, term283519.getClass(), "lastGameId", null);
        setField(term283519, term283519.getClass(), "lastRomVersion", null);
        setField(term283519, term283519.getClass(), "lastDataVersion", null);
        setField(term283519, term283519.getClass(), "lastLoginDate", null);
        setField(term283519, term283519.getClass(), "lastPlayDate", null);
        setIntField(term283519, term283519.getClass(), "lastPlaceId", 0);
        setField(term283519, term283519.getClass(), "lastPlaceName", null);
        setField(term283519, term283519.getClass(), "lastRegionId", null);
        setField(term283519, term283519.getClass(), "lastRegionName", null);
        setField(term283519, term283519.getClass(), "lastAllNetId", null);
        setField(term283519, term283519.getClass(), "lastClientId", null);
        setField(term283519, term283519.getClass(), "lastCountryCode", null);
        setField(term283519, term283519.getClass(), "userNameEx", null);
        setField(term283519, term283519.getClass(), "compatibleCmVersion", null);
        setIntField(term283519, term283519.getClass(), "medal", 0);
        setIntField(term283519, term283519.getClass(), "mapIconId", 0);
        setIntField(term283519, term283519.getClass(), "voiceId", 0);
        setIntField(term283519, term283519.getClass(), "avatarWear", 0);
        setIntField(term283519, term283519.getClass(), "avatarHead", 0);
        setIntField(term283519, term283519.getClass(), "avatarFace", 0);
        setIntField(term283519, term283519.getClass(), "avatarSkin", 0);
        setIntField(term283519, term283519.getClass(), "avatarItem", 0);
        setIntField(term283519, term283519.getClass(), "avatarFront", 0);
        setIntField(term283519, term283519.getClass(), "avatarBack", 0);
        setIntField(term283519, term283519.getClass(), "classEmblemBase", 0);
        setIntField(term283519, term283519.getClass(), "classEmblemMedal", 0);
        setIntField(term283519, term283519.getClass(), "stockedGridCount", 0);
        setIntField(term283519, term283519.getClass(), "exMapLoopCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattlePlayCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattleWinCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattleLoseCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term283519, term283519.getClass(), "charaIllustId", 0);
        setIntField(term283519, term283519.getClass(), "skillId", 0);
        setIntField(term283519, term283519.getClass(), "overPowerPoint", 0);
        setIntField(term283519, term283519.getClass(), "overPowerRate", 0);
        setIntField(term283519, term283519.getClass(), "overPowerLowerRank", 0);
        setIntField(term283519, term283519.getClass(), "avatarPoint", 0);
        setIntField(term283519, term283519.getClass(), "battleRankId", 0);
        setIntField(term283519, term283519.getClass(), "battleRankPoint", 0);
        setIntField(term283519, term283519.getClass(), "eliteRankPoint", 0);
        setIntField(term283519, term283519.getClass(), "netBattle1stCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattle2ndCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattle3rdCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattle4thCount", 0);
        setIntField(term283519, term283519.getClass(), "netBattleCorrection", 0);
        setIntField(term283519, term283519.getClass(), "netBattleErrCnt", 0);
        setIntField(term283519, term283519.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term283519, term283519.getClass(), "battleRewardStatus", 0);
        setIntField(term283519, term283519.getClass(), "battleRewardIndex", 0);
        setIntField(term283519, term283519.getClass(), "battleRewardCount", 0);
        setIntField(term283519, term283519.getClass(), "ext1", 0);
        setIntField(term283519, term283519.getClass(), "ext2", 0);
        setIntField(term283519, term283519.getClass(), "ext3", 0);
        setIntField(term283519, term283519.getClass(), "ext4", 0);
        setIntField(term283519, term283519.getClass(), "ext5", 0);
        setIntField(term283519, term283519.getClass(), "ext6", 0);
        setIntField(term283519, term283519.getClass(), "ext7", 0);
        setIntField(term283519, term283519.getClass(), "ext8", 0);
        setIntField(term283519, term283519.getClass(), "ext9", 0);
        setIntField(term283519, term283519.getClass(), "ext10", 0);
        setField(term283519, term283519.getClass(), "extStr1", null);
        setField(term283519, term283519.getClass(), "extStr2", null);
        setLongField(term283519, term283519.getClass(), "extLong1", 0L);
        setLongField(term283519, term283519.getClass(), "extLong2", 0L);
        setField(term283519, term283519.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term283519, term283519.getClass(), "isNetBattleHost", false);
        setIntField(term283519, term283519.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattleHostErrCnt", argTypes, term283519, args);
    }

};


