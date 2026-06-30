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

public class UserData_getClassEmblemMedal_1229348596263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281825;

    public UserData_getClassEmblemMedal_1229348596263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281825 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term281825, term281825.getClass(), "id", 0L);
        setField(term281825, term281825.getClass(), "card", null);
        setField(term281825, term281825.getClass(), "userName", null);
        setIntField(term281825, term281825.getClass(), "level", 0);
        setIntField(term281825, term281825.getClass(), "reincarnationNum", 0);
        setField(term281825, term281825.getClass(), "exp", null);
        setLongField(term281825, term281825.getClass(), "point", 0L);
        setLongField(term281825, term281825.getClass(), "totalPoint", 0L);
        setIntField(term281825, term281825.getClass(), "playCount", 0);
        setIntField(term281825, term281825.getClass(), "multiPlayCount", 0);
        setIntField(term281825, term281825.getClass(), "playerRating", 0);
        setIntField(term281825, term281825.getClass(), "highestRating", 0);
        setIntField(term281825, term281825.getClass(), "nameplateId", 0);
        setIntField(term281825, term281825.getClass(), "frameId", 0);
        setIntField(term281825, term281825.getClass(), "characterId", 0);
        setIntField(term281825, term281825.getClass(), "trophyId", 0);
        setIntField(term281825, term281825.getClass(), "playedTutorialBit", 0);
        setIntField(term281825, term281825.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term281825, term281825.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term281825, term281825.getClass(), "totalMapNum", 0);
        setLongField(term281825, term281825.getClass(), "totalHiScore", 0L);
        setLongField(term281825, term281825.getClass(), "totalBasicHighScore", 0L);
        setLongField(term281825, term281825.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term281825, term281825.getClass(), "totalExpertHighScore", 0L);
        setLongField(term281825, term281825.getClass(), "totalMasterHighScore", 0L);
        setLongField(term281825, term281825.getClass(), "totalUltimaHighScore", 0L);
        setField(term281825, term281825.getClass(), "eventWatchedDate", null);
        setIntField(term281825, term281825.getClass(), "friendCount", 0);
        setField(term281825, term281825.getClass(), "firstGameId", null);
        setField(term281825, term281825.getClass(), "firstRomVersion", null);
        setField(term281825, term281825.getClass(), "firstDataVersion", null);
        setField(term281825, term281825.getClass(), "firstPlayDate", null);
        setField(term281825, term281825.getClass(), "lastGameId", null);
        setField(term281825, term281825.getClass(), "lastRomVersion", null);
        setField(term281825, term281825.getClass(), "lastDataVersion", null);
        setField(term281825, term281825.getClass(), "lastLoginDate", null);
        setField(term281825, term281825.getClass(), "lastPlayDate", null);
        setIntField(term281825, term281825.getClass(), "lastPlaceId", 0);
        setField(term281825, term281825.getClass(), "lastPlaceName", null);
        setField(term281825, term281825.getClass(), "lastRegionId", null);
        setField(term281825, term281825.getClass(), "lastRegionName", null);
        setField(term281825, term281825.getClass(), "lastAllNetId", null);
        setField(term281825, term281825.getClass(), "lastClientId", null);
        setField(term281825, term281825.getClass(), "lastCountryCode", null);
        setField(term281825, term281825.getClass(), "userNameEx", null);
        setField(term281825, term281825.getClass(), "compatibleCmVersion", null);
        setIntField(term281825, term281825.getClass(), "medal", 0);
        setIntField(term281825, term281825.getClass(), "mapIconId", 0);
        setIntField(term281825, term281825.getClass(), "voiceId", 0);
        setIntField(term281825, term281825.getClass(), "avatarWear", 0);
        setIntField(term281825, term281825.getClass(), "avatarHead", 0);
        setIntField(term281825, term281825.getClass(), "avatarFace", 0);
        setIntField(term281825, term281825.getClass(), "avatarSkin", 0);
        setIntField(term281825, term281825.getClass(), "avatarItem", 0);
        setIntField(term281825, term281825.getClass(), "avatarFront", 0);
        setIntField(term281825, term281825.getClass(), "avatarBack", 0);
        setIntField(term281825, term281825.getClass(), "classEmblemBase", 0);
        setIntField(term281825, term281825.getClass(), "classEmblemMedal", 0);
        setIntField(term281825, term281825.getClass(), "stockedGridCount", 0);
        setIntField(term281825, term281825.getClass(), "exMapLoopCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattlePlayCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattleWinCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattleLoseCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term281825, term281825.getClass(), "charaIllustId", 0);
        setIntField(term281825, term281825.getClass(), "skillId", 0);
        setIntField(term281825, term281825.getClass(), "overPowerPoint", 0);
        setIntField(term281825, term281825.getClass(), "overPowerRate", 0);
        setIntField(term281825, term281825.getClass(), "overPowerLowerRank", 0);
        setIntField(term281825, term281825.getClass(), "avatarPoint", 0);
        setIntField(term281825, term281825.getClass(), "battleRankId", 0);
        setIntField(term281825, term281825.getClass(), "battleRankPoint", 0);
        setIntField(term281825, term281825.getClass(), "eliteRankPoint", 0);
        setIntField(term281825, term281825.getClass(), "netBattle1stCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattle2ndCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattle3rdCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattle4thCount", 0);
        setIntField(term281825, term281825.getClass(), "netBattleCorrection", 0);
        setIntField(term281825, term281825.getClass(), "netBattleErrCnt", 0);
        setIntField(term281825, term281825.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term281825, term281825.getClass(), "battleRewardStatus", 0);
        setIntField(term281825, term281825.getClass(), "battleRewardIndex", 0);
        setIntField(term281825, term281825.getClass(), "battleRewardCount", 0);
        setIntField(term281825, term281825.getClass(), "ext1", 0);
        setIntField(term281825, term281825.getClass(), "ext2", 0);
        setIntField(term281825, term281825.getClass(), "ext3", 0);
        setIntField(term281825, term281825.getClass(), "ext4", 0);
        setIntField(term281825, term281825.getClass(), "ext5", 0);
        setIntField(term281825, term281825.getClass(), "ext6", 0);
        setIntField(term281825, term281825.getClass(), "ext7", 0);
        setIntField(term281825, term281825.getClass(), "ext8", 0);
        setIntField(term281825, term281825.getClass(), "ext9", 0);
        setIntField(term281825, term281825.getClass(), "ext10", 0);
        setField(term281825, term281825.getClass(), "extStr1", null);
        setField(term281825, term281825.getClass(), "extStr2", null);
        setLongField(term281825, term281825.getClass(), "extLong1", 0L);
        setLongField(term281825, term281825.getClass(), "extLong2", 0L);
        setField(term281825, term281825.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term281825, term281825.getClass(), "isNetBattleHost", false);
        setIntField(term281825, term281825.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassEmblemMedal", argTypes, term281825, args);
    }

};


