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

public class UserData_setUserName_1385358082309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219893;

    public UserData_setUserName_1385358082309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219893 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4219893, term4219893.getClass(), "id", 0L);
        setField(term4219893, term4219893.getClass(), "card", null);
        setField(term4219893, term4219893.getClass(), "userName", null);
        setIntField(term4219893, term4219893.getClass(), "level", 0);
        setIntField(term4219893, term4219893.getClass(), "reincarnationNum", 0);
        setField(term4219893, term4219893.getClass(), "exp", null);
        setLongField(term4219893, term4219893.getClass(), "point", 0L);
        setLongField(term4219893, term4219893.getClass(), "totalPoint", 0L);
        setIntField(term4219893, term4219893.getClass(), "playCount", 0);
        setIntField(term4219893, term4219893.getClass(), "multiPlayCount", 0);
        setIntField(term4219893, term4219893.getClass(), "playerRating", 0);
        setIntField(term4219893, term4219893.getClass(), "highestRating", 0);
        setIntField(term4219893, term4219893.getClass(), "nameplateId", 0);
        setIntField(term4219893, term4219893.getClass(), "frameId", 0);
        setIntField(term4219893, term4219893.getClass(), "characterId", 0);
        setIntField(term4219893, term4219893.getClass(), "trophyId", 0);
        setIntField(term4219893, term4219893.getClass(), "playedTutorialBit", 0);
        setIntField(term4219893, term4219893.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4219893, term4219893.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4219893, term4219893.getClass(), "totalMapNum", 0);
        setLongField(term4219893, term4219893.getClass(), "totalHiScore", 0L);
        setLongField(term4219893, term4219893.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4219893, term4219893.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4219893, term4219893.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4219893, term4219893.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4219893, term4219893.getClass(), "totalUltimaHighScore", 0L);
        setField(term4219893, term4219893.getClass(), "eventWatchedDate", null);
        setIntField(term4219893, term4219893.getClass(), "friendCount", 0);
        setField(term4219893, term4219893.getClass(), "firstGameId", null);
        setField(term4219893, term4219893.getClass(), "firstRomVersion", null);
        setField(term4219893, term4219893.getClass(), "firstDataVersion", null);
        setField(term4219893, term4219893.getClass(), "firstPlayDate", null);
        setField(term4219893, term4219893.getClass(), "lastGameId", null);
        setField(term4219893, term4219893.getClass(), "lastRomVersion", null);
        setField(term4219893, term4219893.getClass(), "lastDataVersion", null);
        setField(term4219893, term4219893.getClass(), "lastLoginDate", null);
        setField(term4219893, term4219893.getClass(), "lastPlayDate", null);
        setIntField(term4219893, term4219893.getClass(), "lastPlaceId", 0);
        setField(term4219893, term4219893.getClass(), "lastPlaceName", null);
        setField(term4219893, term4219893.getClass(), "lastRegionId", null);
        setField(term4219893, term4219893.getClass(), "lastRegionName", null);
        setField(term4219893, term4219893.getClass(), "lastAllNetId", null);
        setField(term4219893, term4219893.getClass(), "lastClientId", null);
        setField(term4219893, term4219893.getClass(), "lastCountryCode", null);
        setField(term4219893, term4219893.getClass(), "userNameEx", null);
        setField(term4219893, term4219893.getClass(), "compatibleCmVersion", null);
        setIntField(term4219893, term4219893.getClass(), "medal", 0);
        setIntField(term4219893, term4219893.getClass(), "mapIconId", 0);
        setIntField(term4219893, term4219893.getClass(), "voiceId", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarWear", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarHead", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarFace", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarSkin", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarItem", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarFront", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarBack", 0);
        setIntField(term4219893, term4219893.getClass(), "classEmblemBase", 0);
        setIntField(term4219893, term4219893.getClass(), "classEmblemMedal", 0);
        setIntField(term4219893, term4219893.getClass(), "stockedGridCount", 0);
        setIntField(term4219893, term4219893.getClass(), "exMapLoopCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattlePlayCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattleWinCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattleLoseCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4219893, term4219893.getClass(), "charaIllustId", 0);
        setIntField(term4219893, term4219893.getClass(), "skillId", 0);
        setIntField(term4219893, term4219893.getClass(), "overPowerPoint", 0);
        setIntField(term4219893, term4219893.getClass(), "overPowerRate", 0);
        setIntField(term4219893, term4219893.getClass(), "overPowerLowerRank", 0);
        setIntField(term4219893, term4219893.getClass(), "avatarPoint", 0);
        setIntField(term4219893, term4219893.getClass(), "battleRankId", 0);
        setIntField(term4219893, term4219893.getClass(), "battleRankPoint", 0);
        setIntField(term4219893, term4219893.getClass(), "eliteRankPoint", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattle1stCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattle2ndCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattle3rdCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattle4thCount", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattleCorrection", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattleErrCnt", 0);
        setIntField(term4219893, term4219893.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4219893, term4219893.getClass(), "battleRewardStatus", 0);
        setIntField(term4219893, term4219893.getClass(), "battleRewardIndex", 0);
        setIntField(term4219893, term4219893.getClass(), "battleRewardCount", 0);
        setIntField(term4219893, term4219893.getClass(), "ext1", 0);
        setIntField(term4219893, term4219893.getClass(), "ext2", 0);
        setIntField(term4219893, term4219893.getClass(), "ext3", 0);
        setIntField(term4219893, term4219893.getClass(), "ext4", 0);
        setIntField(term4219893, term4219893.getClass(), "ext5", 0);
        setIntField(term4219893, term4219893.getClass(), "ext6", 0);
        setIntField(term4219893, term4219893.getClass(), "ext7", 0);
        setIntField(term4219893, term4219893.getClass(), "ext8", 0);
        setIntField(term4219893, term4219893.getClass(), "ext9", 0);
        setIntField(term4219893, term4219893.getClass(), "ext10", 0);
        setField(term4219893, term4219893.getClass(), "extStr1", null);
        setField(term4219893, term4219893.getClass(), "extStr2", null);
        setLongField(term4219893, term4219893.getClass(), "extLong1", 0L);
        setLongField(term4219893, term4219893.getClass(), "extLong2", 0L);
        setField(term4219893, term4219893.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4219893, term4219893.getClass(), "isNetBattleHost", false);
        setIntField(term4219893, term4219893.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term4219893, args);
    }

};


