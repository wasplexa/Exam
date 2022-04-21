package YandexMarket.utils;


import org.apache.log4j.LogManager;


    /**
     * Created by st on 13.04.2022.
     */
    public class Logger {
        private static org.apache.log4j.Logger logger = LogManager.getLogger(Logger.class);

        public static void info(String text) {
            logger.info(text);
        }

        public static void error(String text) {
            logger.error(text);
        }
    }


