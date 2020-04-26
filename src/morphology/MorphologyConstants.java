package morphology;

import image.Image;

public interface MorphologyConstants {
	
	Image STRUCT_PRIMARY = new Image(new short[][]{{0,255,0},{255,255,255},{0,255,0}}),
			STRUCT_RING = new Image(new short[][]{{0, 0, 0, 255, 255, 255, 255, 0, 0, 0}, {0, 0, 255, 0, 0, 0, 0, 255, 0, 0}, {0, 255, 0, 0, 0, 0, 0, 0, 255, 0}, {255, 0, 0, 0, 0, 0, 0, 0, 0, 255}, {255, 0, 0, 0, 0, 0, 0, 0, 0, 255}, {255, 0, 0, 0, 0, 0, 0, 0, 0, 255}, {255, 0, 0, 0, 0, 0, 0, 0, 0, 255}, {0, 255, 0, 0, 0, 0, 0, 0, 255, 0}, {0, 0, 255, 0, 0, 0, 0, 255, 0, 0}, {0, 0, 0, 255, 255, 255, 255, 0, 0, 0}}),
			STRUCT_FILLED_RING = new Image(new short[][]{{0, 0, 0, 255, 255, 255, 255, 0, 0, 0}, {0, 0, 255, 255, 255, 255, 255, 255, 0, 0}, {0, 255, 255, 255, 255, 255, 255, 255, 255, 0}, {255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, {255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, {255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, {255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, {0, 255, 255, 255, 255, 255, 255, 255, 255, 0}, {0, 0, 255, 255, 255, 255, 255, 255, 0, 0}, {0, 0, 0, 255, 255, 255, 255, 0, 0, 0}}),
			STRUCT_SIMPLE_BINARY_RECT = new Image(new short[][]{{1,1,1},{1,1,1},{1,1,1}}),
			STRUCT_SUP = new Image(new short[][]{{255,255,255},{255,255,255},{255,255,255}}),
			STRUCT_WIDER_CROSS = new Image(new short[][]{{0,0,255,0,0},{0,255,255,255,0},{255,255,255,255,255},{0,255,255,255,0},{0,0,255,0,0}});
	

}
